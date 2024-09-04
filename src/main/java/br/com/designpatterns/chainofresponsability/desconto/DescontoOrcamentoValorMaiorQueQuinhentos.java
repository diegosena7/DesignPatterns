package br.com.designpatterns.chainofresponsability.desconto;

import br.com.designpatterns.chainofresponsability.orcamento.OrcamentoNew;

import java.math.BigDecimal;

/**
 * Handler/Manipulador Concreto
 * <p>
 * Responsável pelo código de aplicaçao de desconto, que nesse caso aplica 10% de desconto
 * em pedidos acima de 500 reais e chama o próximo manipuador que verifica se a regra se
 * aplica a ele ao chamar proximoDesconto.calcularDesconto(orcamentoNew);
 * <p>
 * Recebe o orcamento e verificar se é aplicável a regra de negócio.
 */
public class DescontoOrcamentoValorMaiorQueQuinhentos extends DescontoAbstract{

    public DescontoOrcamentoValorMaiorQueQuinhentos(DescontoAbstract proximoDesconto) {
        super(proximoDesconto);
    }

    public BigDecimal calcularDesconto(OrcamentoNew orcamentoNew){
        if(orcamentoNew.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamentoNew.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximoDesconto.calcularDesconto(orcamentoNew);
    }
}

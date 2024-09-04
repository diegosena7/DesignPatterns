package br.com.designpatterns.chainofresponsability.desconto;

import br.com.designpatterns.chainofresponsability.orcamento.OrcamentoNew;

import java.math.BigDecimal;

/**
 * Handler/Manipulador Concreto
 * <p>
 * Responsável pelo código de aplicaçao de desconto, que nesse caso é aplicável para pedidos com mais de 5 itens.
 * Recebe a classe Handler/Manipuladora Pai no construtor e após verificar se a regra é aplicável
 * chama o próximo hander/manipulador para verificar se a regra se aplica a ele ao chamar o método
 * proximoDesconto.calcularDesconto(orcamentoNew);
 * <p>
 * Recebe o orcamento e verificar se é aplicável a regra de negócio.
 */
public class DescontoOrcamentoMaisDeCincoItens extends
        DescontoAbstract{
    public DescontoOrcamentoMaisDeCincoItens(DescontoAbstract proximoDesconto) {
        super(proximoDesconto);
    }

    public BigDecimal calcularDesconto(OrcamentoNew orcamentoNew){
        if(orcamentoNew.getQtidadeItens() > 5){
            return orcamentoNew.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximoDesconto.calcularDesconto(orcamentoNew);
    }
}

package br.com.designpatterns.chainofresponsability.desconto;

import br.com.designpatterns.chainofresponsability.orcamento.OrcamentoNew;

import java.math.BigDecimal;

/**
 * Handler/Manipulador Concreto
 * <p>
 * Responsável pelo código de aplicaçao de desconto, que nesse caso é ZERO.
 * Recebe o orcamento e verificar se é aplicável a regra de negócio.
 */
public class SemDescontoOrcamento extends DescontoAbstract{

    public SemDescontoOrcamento() {
        super(null);
    }

    @Override
    public BigDecimal calcularDesconto(OrcamentoNew orcamentoNew) {
        return BigDecimal.ZERO;
    }
}

package br.com.designpatterns.strategy.imposto;

import br.com.designpatterns.strategy.orcamento.Orcamento;
import java.math.BigDecimal;


public class TipoICMS implements TipoImposto {
    @Override
    public BigDecimal calculaImpostos(Orcamento valorOrcamento) {
        return BigDecimal.valueOf(0.10).multiply(valorOrcamento.getValor());
    }
}

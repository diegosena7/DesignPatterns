package br.com.designpatterns.strategy.imposto;

import br.com.designpatterns.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {
    public BigDecimal calculaImpostos(Orcamento valorOrcamento);
}

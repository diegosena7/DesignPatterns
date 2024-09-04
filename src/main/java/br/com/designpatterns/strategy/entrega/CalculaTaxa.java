package br.com.designpatterns.strategy.entrega;

import br.com.designpatterns.strategy.compra.Compra;

import java.math.BigDecimal;

public interface CalculaTaxa {

    public BigDecimal calculaTaxa(Compra compra);
}

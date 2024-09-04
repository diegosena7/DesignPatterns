package br.com.designpatterns.strategy.entrega;

import br.com.designpatterns.strategy.compra.Compra;

import java.math.BigDecimal;

public class CalculaTaxaCompraAcimaDeCemReais implements CalculaTaxa{
    @Override
    public BigDecimal calculaTaxa(Compra compra) {
        BigDecimal taxa = compra.getValorCompra().multiply(BigDecimal.valueOf(0.05));
        return compra.getValorCompra().add(taxa);
    }
}

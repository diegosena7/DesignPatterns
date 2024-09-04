package br.com.designpatterns.strategy.entrega;

import br.com.designpatterns.strategy.compra.Compra;

import java.math.BigDecimal;

public class CalculaTaxaCompraAbaixoDeCemReais implements CalculaTaxa{
    @Override
    public BigDecimal calculaTaxa(Compra compra) {
        BigDecimal taxa = compra.getValorCompra().multiply(BigDecimal.valueOf(0.10));
        return compra.getValorCompra().add(taxa);
    }

}

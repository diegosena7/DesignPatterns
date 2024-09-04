package br.com.designpatterns.strategy.entrega;

import br.com.designpatterns.strategy.compra.Compra;

import java.math.BigDecimal;

public class CalculaTaxaDeEntrega {

    public static BigDecimal calculaTaxaDeEntrega(Compra compra, CalculaTaxa calculaTaxa){
        return calculaTaxa.calculaTaxa(compra);
    }
}

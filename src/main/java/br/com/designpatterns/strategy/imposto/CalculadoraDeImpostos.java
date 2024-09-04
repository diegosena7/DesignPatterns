package br.com.designpatterns.strategy.imposto;

import br.com.designpatterns.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public static BigDecimal calculaImpostos(Orcamento orcamento, TipoImposto imposto){
        return imposto.calculaImpostos(orcamento);
    }
}

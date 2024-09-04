package br.com.designpatterns.chainofresponsability;


import br.com.designpatterns.chainofresponsability.desconto.CalcularDescontoOrcamento;
import br.com.designpatterns.chainofresponsability.orcamento.OrcamentoNew;

import java.math.BigDecimal;

public class MainChainOfResponsability {
    public static void main(String[] args) {

        OrcamentoNew orcamento1 = OrcamentoNew.builder()
                .valor(new BigDecimal(200))
                .qtidadeItens(6)
                .build();

        OrcamentoNew orcamento2 = OrcamentoNew.builder()
                .valor(new BigDecimal(1000))
                .qtidadeItens(1)
                .build();

        CalcularDescontoOrcamento calcularDescontoOrcamento = new CalcularDescontoOrcamento();
        System.out.println("Orçamento 1: " + calcularDescontoOrcamento.calculaDescontoOrcamento(orcamento1));
        System.out.println("Orçamento 2: " + calcularDescontoOrcamento.calculaDescontoOrcamento(orcamento2));
    }
}
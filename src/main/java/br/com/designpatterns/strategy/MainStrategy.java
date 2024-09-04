package br.com.designpatterns.strategy;

import br.com.designpatterns.strategy.compra.Compra;
import br.com.designpatterns.strategy.entrega.CalculaTaxaCompraAbaixoDeCemReais;
import br.com.designpatterns.strategy.entrega.CalculaTaxaCompraAcimaDeCemReais;
import br.com.designpatterns.strategy.entrega.CalculaTaxaDeEntrega;
import br.com.designpatterns.strategy.imposto.CalculadoraDeImpostos;
import br.com.designpatterns.strategy.imposto.TipoICMS;
import br.com.designpatterns.strategy.imposto.TipoISS;
import br.com.designpatterns.strategy.orcamento.Orcamento;
import br.com.designpatterns.strategy.pagamentos.*;

import java.math.BigDecimal;

public class MainStrategy {
    public static void main(String[] args) {

        Orcamento orcamento = Orcamento.builder()
                .valor(new BigDecimal(100))
                .build();

        System.out.println("ICMS: " + CalculadoraDeImpostos.calculaImpostos(orcamento, new TipoICMS()));
        System.out.println("ISS: " + CalculadoraDeImpostos.calculaImpostos(orcamento, new TipoISS()));

        Compra compraAcimaDeCem = Compra.builder()
                .valorCompra(new BigDecimal(150))
                .build();

        Compra compraAbaixoDeCem = Compra.builder()
                .valorCompra(new BigDecimal(50))
                .build();

        System.out.println("Compra acima de 100 reais: " + CalculaTaxaDeEntrega.calculaTaxaDeEntrega(compraAcimaDeCem, new CalculaTaxaCompraAcimaDeCemReais()));
        System.out.println("Compra abaixo de 100 reais: " + CalculaTaxaDeEntrega.calculaTaxaDeEntrega(compraAbaixoDeCem, new CalculaTaxaCompraAbaixoDeCemReais()));

        ClienteCredito clienteCredito = ClienteCredito.builder()
                .valorPagamento(new BigDecimal("200"))
                .numeroCartao("")
                .build();

        ClientePaypal clientePaypal = ClientePaypal.builder()
                .valorPagamento(new BigDecimal("500"))
                .email("email")
                .nomeCliente("nomeClient")
                .build();

        FinalizaPagamentos.finalizaPagamentos(new PagtoCompraCartaoDeCredito(), clienteCredito);
        FinalizaPagamentos.finalizaPagamentos(new PagtoCompraPaypal(), clientePaypal);
    }
}
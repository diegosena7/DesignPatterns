package br.com.designpatterns.chainofresponsability.desconto;

import br.com.designpatterns.chainofresponsability.orcamento.OrcamentoNew;

import java.math.BigDecimal;


/**
 * Handler/manipulador responsável pelo método que lida com o cállculo de desconstos
 * e armazena uma referência para o próximo handler/manipulador no caso o proximoDesconto.
 * Usamos herança para usar as classes concretas chamando o método da classe Pai.
 */
public abstract class DescontoAbstract {

    protected DescontoAbstract proximoDesconto;

    public DescontoAbstract(DescontoAbstract proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract BigDecimal calcularDesconto(OrcamentoNew orcamentoNew);
}

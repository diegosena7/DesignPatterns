package br.com.designpatterns.chainofresponsability.desconto;

import br.com.designpatterns.chainofresponsability.orcamento.OrcamentoNew;

import java.math.BigDecimal;

/**
 * Client
 * <p>
 * Responsável por chamar os Handlers/Manipuladores encadeando as chamadas que não precisam estar em ordem
 * tendo em vist que a regra de aplicação da lógica de negócio está nos hadlers/manipuladores concretos
 * Recebe o orcamento e chama os hadlers/manipuladores de maneira encadeada para verificar a aplicação
 * da regra de negócio.
 */
public class CalcularDescontoOrcamento {
    public BigDecimal calculaDescontoOrcamento(OrcamentoNew orcamentoNew) {

        DescontoAbstract desconto = new DescontoOrcamentoMaisDeCincoItens(
                new DescontoOrcamentoValorMaiorQueQuinhentos(
                        new SemDescontoOrcamento()));

        return desconto.calcularDesconto(orcamentoNew);
    }
}

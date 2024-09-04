package br.com.designpatterns.strategy.pagamentos;

/**
 * Estratégia comum para todas as estratégias que serão implementadas.
 */
public interface TiposPagamentos {
    public void tiposPagamentos(PagamentoCliente pagamentoCliente);
}

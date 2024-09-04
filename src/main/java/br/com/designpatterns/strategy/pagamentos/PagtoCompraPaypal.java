package br.com.designpatterns.strategy.pagamentos;

/**
 * Estratégia concreta que implementa TiposPagamentos a estratégia comum/interface com a estatégia de pagamento
 * do tipo Paypal
 */
public class PagtoCompraPaypal implements TiposPagamentos{
    @Override
    public void tiposPagamentos(PagamentoCliente pagamentoCliente) {
        System.out.println("Valor no paypal: " + pagamentoCliente.getValorPagamento());
    }
}

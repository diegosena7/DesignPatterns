package br.com.designpatterns.strategy.pagamentos;

/**
 * Classe usada para chamar a interface que se responsabiliza por repassar para as classes concretas
 * o tipo de pagamento do cliente e a classe concreta implementa a regra de negócio implementada no
 * método tiposPagamentos ao chamar pagamentos.tiposPagamentos(pagamentoCliente);
 */
public class FinalizaPagamentos {

    public static void finalizaPagamentos(TiposPagamentos pagamentos, PagamentoCliente pagamentoCliente){
        System.out.println("PagamentoCliente: " + pagamentoCliente);
        pagamentos.tiposPagamentos(pagamentoCliente);
    }
}

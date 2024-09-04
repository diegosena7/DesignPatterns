package br.com.designpatterns.strategy.pagamentos;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class ClientePaypal extends PagamentoCliente {

    private String email;
    private String nomeCliente;

}

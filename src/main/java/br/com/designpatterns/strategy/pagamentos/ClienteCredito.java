package br.com.designpatterns.strategy.pagamentos;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
@SuperBuilder
public class ClienteCredito extends PagamentoCliente{

    private String numeroCartao;

}

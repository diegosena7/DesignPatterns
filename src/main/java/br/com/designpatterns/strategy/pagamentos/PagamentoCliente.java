package br.com.designpatterns.strategy.pagamentos;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
public class PagamentoCliente {

    private BigDecimal valorPagamento;
}

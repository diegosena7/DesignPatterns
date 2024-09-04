package br.com.designpatterns.strategy.compra;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Compra {

    private BigDecimal valorCompra;
}

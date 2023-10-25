package org.example.product.base;

import java.math.BigDecimal;

public interface Replenishable {

  BigDecimal replenish(BigDecimal amount);
}

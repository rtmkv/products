package org.example.product.deposit;

import java.math.BigDecimal;
import org.example.product.base.Replenishable;

public class ReplenishableDeposit extends Deposit implements Replenishable {

  @Override
  public BigDecimal replenish(BigDecimal amount) {
    return balance = balance.add(amount);
  }

  public ReplenishableDeposit(String name, BigDecimal balance) {
    super(name, balance);
  }
}

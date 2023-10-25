package org.example.product.card;

import java.math.BigDecimal;
import org.example.product.base.Debt;
import org.example.product.base.Rate;

public class CreditCard extends Card implements Debt, Rate {

  private final BigDecimal interestRate;

  @Override
  public BigDecimal writeOff(BigDecimal amount) {
    return balance = balance.subtract(amount);
  }

  @Override
  public BigDecimal getDebt() {
    return balance.compareTo(BigDecimal.ZERO) < 0 ? balance : BigDecimal.ZERO;
  }

  @Override
  public BigDecimal getRate() {
    return interestRate;
  }

  public CreditCard(String name, BigDecimal balance) {
    super(name, balance);
    this.interestRate = BigDecimal.ZERO;
  }

  public CreditCard(String name, BigDecimal balance, BigDecimal interestRate) {
    super(name, balance);
    this.interestRate = interestRate;
  }

}

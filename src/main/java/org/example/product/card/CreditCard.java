package org.example.product.card;

import java.math.BigDecimal;
import org.example.product.base.DebtInterface;
import org.example.product.base.InterestRateInterface;

public class CreditCard extends Card implements DebtInterface, InterestRateInterface {

  private final BigDecimal interestRate;

  @Override
  public BigDecimal withdrawMoney(BigDecimal amount) {
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

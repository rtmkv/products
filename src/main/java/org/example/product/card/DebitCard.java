package org.example.product.card;

import java.math.BigDecimal;
import org.example.product.base.Currency;

public class DebitCard extends Card {

  @Override
  public BigDecimal writeOff(BigDecimal amount) {
    if (balance.compareTo(amount) < 0) {
      throw new IllegalArgumentException("Write off amount must not exceed the balance.");
    }
    return balance = balance.subtract(amount);
  }

  public DebitCard(String name, BigDecimal balance) {
    super(name, balance);
  }

  public DebitCard(String name, Currency currency) {
    super(name, BigDecimal.ZERO, currency);
  }

  public DebitCard(String name, BigDecimal balance, Currency currency) {
    super(name, balance, currency);
  }
}

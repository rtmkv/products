package org.example.product.card;

import java.math.BigDecimal;
import org.example.product.base.AbstractProduct;
import org.example.product.base.Currency;
import org.example.product.base.GetBalanceInterface;
import org.example.product.base.Replenishable;
import org.example.product.base.WriteOffInterface;

public abstract class Card extends AbstractProduct implements Replenishable, WriteOffInterface, GetBalanceInterface {

  @Override
  public BigDecimal replenish(BigDecimal amount) {
    return balance = balance.add(amount);
  }

  @Override
  public BigDecimal getBalance() {
    return balance;
  }

  public abstract BigDecimal writeOff(BigDecimal amount);

  public Card(String name, BigDecimal balance) {
    super(name, balance, Currency.getDefault());
  }

  public Card(String name, BigDecimal balance, Currency currency) {
    super(name, balance, currency);
  }
}

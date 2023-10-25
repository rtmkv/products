package org.example.product.card;

import java.math.BigDecimal;
import org.example.product.base.AbstractProduct;
import org.example.product.base.Currency;
import org.example.product.base.BalanceInterface;
import org.example.product.base.ReplenishmentInterface;
import org.example.product.base.WithdrawInterface;

public abstract class Card extends AbstractProduct implements ReplenishmentInterface, WithdrawInterface, BalanceInterface {

  @Override
  public BigDecimal replenish(BigDecimal amount) {
    return balance = balance.add(amount);
  }

  @Override
  public BigDecimal getBalance() {
    return balance;
  }

  public abstract BigDecimal withdrawMoney(BigDecimal amount);

  public Card(String name, BigDecimal balance) {
    super(name, balance, Currency.getDefault());
  }

  public Card(String name, BigDecimal balance, Currency currency) {
    super(name, balance, currency);
  }
}

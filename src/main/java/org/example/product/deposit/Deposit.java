package org.example.product.deposit;

import java.math.BigDecimal;
import org.example.product.base.AbstractProduct;
import org.example.product.base.Closeable;
import org.example.product.base.Currency;
import org.example.product.base.BalanceInterface;

public abstract class Deposit extends AbstractProduct implements BalanceInterface, Closeable {

  private boolean closed = false;

  @Override
  public void close() {
    balance = BigDecimal.ZERO;
    closed = true;
  }

  @Override
  public boolean isClosed() {
    return closed;
  }

  @Override
  public BigDecimal getBalance() {
    return balance;
  }

  public Deposit(String name, BigDecimal balance) {
    super(name, balance, Currency.getDefault());
  }

  public Deposit(String name, BigDecimal balance, Currency currency) {
    super(name, balance, currency);
  }
}

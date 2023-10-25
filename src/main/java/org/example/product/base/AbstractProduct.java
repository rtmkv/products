package org.example.product.base;

import java.math.BigDecimal;

public abstract class AbstractProduct {

  protected String name;
  protected BigDecimal balance;
  protected Currency currency;

  public AbstractProduct(String name, BigDecimal balance, Currency currency) {
    this.name = name;
    this.balance = balance;
    this.currency = currency;
  }
}

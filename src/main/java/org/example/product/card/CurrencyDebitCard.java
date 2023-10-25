package org.example.product.card;

import java.math.BigDecimal;
import org.example.product.base.Currency;

public class CurrencyDebitCard extends DebitCard {

  public CurrencyDebitCard(String name, Currency currency) {
    super(name, currency);
  }

  public CurrencyDebitCard(String name, BigDecimal balance, Currency currency) {
    super(name, balance, currency);
  }
}

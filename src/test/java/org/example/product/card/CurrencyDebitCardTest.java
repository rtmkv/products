package org.example.product.card;

import static java.math.BigDecimal.valueOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import org.example.product.base.Currency;
import org.junit.jupiter.api.Test;

public class CurrencyDebitCardTest {

  @Test
  public void testReplenishCard() {
    CurrencyDebitCard card = new CurrencyDebitCard("Debit card", BigDecimal.ZERO, Currency.CNY);

    card.replenish(valueOf(50));
    assertEquals(valueOf(50), card.getBalance());
  }

  @Test
  public void testWriteOffFromCardPositiveResultingBalance() {
    CurrencyDebitCard card = new CurrencyDebitCard("Debit card", valueOf(50), Currency.EUR);
    card.writeOff(valueOf(35));

    assertEquals(valueOf(15), card.getBalance());
  }

  @Test
  public void testWriteOffFromCardNegativeResultingBalance() {
    CurrencyDebitCard card = new CurrencyDebitCard("Debit card", valueOf(50), Currency.EUR);
    assertThrows(IllegalArgumentException.class, () -> card.writeOff(valueOf(100)));
  }
}

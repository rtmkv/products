package org.example.product.card;

import static java.math.BigDecimal.ZERO;
import static java.math.BigDecimal.valueOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class CreditCardTest {

  @Test
  public void testReplenishCard() {
    CreditCard card = new CreditCard("Debit card", BigDecimal.ZERO);
    card.replenish(valueOf(50));
    assertEquals(valueOf(50), card.getBalance());
  }

  @Test
  public void testWriteOffFromCardPositiveResultingBalance() {
    CreditCard card = new CreditCard("Debit card", valueOf(50));
    card.withdrawMoney(valueOf(35));
    assertEquals(valueOf(15), card.getBalance());
  }

  @Test
  public void testWriteOffFromCardNegativeResultingBalance() {
    CreditCard card = new CreditCard("Debit card", valueOf(50));
    card.withdrawMoney(valueOf(75));
    assertEquals(valueOf(-25), card.getBalance());
  }

  @Test
  public void testGetDebtWithPositiveBalance() {
    CreditCard card = new CreditCard("Debit card", valueOf(50));
    assertEquals(ZERO, card.getDebt());
  }

  @Test
  public void testGetDebtWithNegativeBalance() {
    CreditCard card = new CreditCard("Debit card", valueOf(-50));
    assertEquals(valueOf(-50), card.getDebt());
  }
}

package org.example.product.card;

import static java.math.BigDecimal.valueOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class DebitCardTest {

  @Test
  public void testReplenishCard() {
    DebitCard card = new DebitCard("Debit card", BigDecimal.ZERO);

    card.replenish(valueOf(50));
    assertEquals(valueOf(50), card.getBalance());
  }

  @Test
  public void testWriteOffFromCardPositiveResultingBalance() {
    DebitCard card = new DebitCard("Debit card", valueOf(50));
    card.writeOff(valueOf(35));

    assertEquals(valueOf(15), card.getBalance());
  }

  @Test
  public void testWriteOffFromCardNegativeResultingBalance() {
    DebitCard card = new DebitCard("Debit card", valueOf(50));
    assertThrows(IllegalArgumentException.class, () -> card.writeOff(valueOf(100)));
  }
}

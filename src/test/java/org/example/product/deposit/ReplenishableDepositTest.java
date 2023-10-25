package org.example.product.deposit;

import static java.math.BigDecimal.valueOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class ReplenishableDepositTest {

  @Test
  public void testReplenishDeposit() {
    ReplenishableDeposit deposit = new ReplenishableDeposit("Deposit", BigDecimal.ZERO);
    deposit.replenish(valueOf(50));
    assertEquals(valueOf(50), deposit.getBalance());
  }

  @Test
  public void testCloseDeposit() {
    ReplenishableDeposit deposit = new ReplenishableDeposit("Deposit", BigDecimal.ZERO);
    deposit.close();
    assertTrue(deposit.isClosed());
  }

}

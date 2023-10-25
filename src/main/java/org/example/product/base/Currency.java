package org.example.product.base;

public enum Currency {
  RU,
  EUR,
  USD,
  GBP,
  CNY;

  public static Currency getDefault() {
    return RU;
  }
}

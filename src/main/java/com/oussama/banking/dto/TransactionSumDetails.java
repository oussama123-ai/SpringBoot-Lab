package com.oussama.banking.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author oussama othmani
 */
public interface TransactionSumDetails {

  LocalDate getTransactionDate();

  BigDecimal getAmount();

}

package com.oussama.banking.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author oussama othmani
 */

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction extends AbstractEntity {

  private BigDecimal amount;

  @Enumerated(EnumType.STRING)
  private TransactionType type;

  private String destinationIban;

  @Column(updatable = false)
  private LocalDate transactionDate;

  @ManyToOne
  @JoinColumn(name = "id_user")
  private User user;
}

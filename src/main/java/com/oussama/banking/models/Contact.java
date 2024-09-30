package com.oussama.banking.models;

import javax.persistence.Entity;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contact extends AbstractEntity {

  private String firstname;

  private String lastname;

  private String email;

  private String iban;

  @ManyToOne
  @JoinColumn(name = "id_user")
  private User user;

}

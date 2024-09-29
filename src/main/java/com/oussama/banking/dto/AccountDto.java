package com.oussama.banking.dto;

import com.oussama.banking.models.Account;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author oussama othmani
 */

@Getter
@Setter
@AllArgsConstructor
@Builder
public class AccountDto {

  private Integer id;

  private String iban;

  private UserDto user;

  public static AccountDto fromEntity(Account account) {
    return AccountDto.builder()
        .id(account.getId())
        .iban(account.getIban())
        .user(UserDto.fromEntity(account.getUser()))
        .build();

  }

  public static Account toEntity(AccountDto account) {
    return Account.builder()
        .id(account.getId())
        .iban(account.getIban())
        .user(UserDto.toEntity(account.getUser()))
        .build();

  }
}

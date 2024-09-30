package com.oussama.banking.dto;

import lombok.Data;

/**
 * @author oussama othmani
 */
@Data
public class AuthenticationRequest {

  private String email;
  private String password;
}

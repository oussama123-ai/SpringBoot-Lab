package com.oussama.banking.exceptions;

import java.util.Set;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author oussama othmani
 */

@RequiredArgsConstructor
public class ObjectValidationException extends RuntimeException {

  @Getter
  private final Set<String> violations;

  @Getter
  private final String violationSource;

}

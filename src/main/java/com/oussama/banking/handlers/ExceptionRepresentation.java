package com.oussama.banking.handlers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * @author oussama othmani
 */

@Getter
@Builder
@AllArgsConstructor
@JsonInclude(Include.NON_EMPTY)
public class ExceptionRepresentation {

  private String errorMessage;
  private String errorSource;
  private Set<String> validationErrors;

}

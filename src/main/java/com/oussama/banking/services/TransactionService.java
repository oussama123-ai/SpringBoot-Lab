package com.oussama.banking.services;

import com.oussama.banking.dto.TransactionDto;

import java.util.List;

/**
 * @author oussama othmani
 */
public interface TransactionService extends AbstractService<TransactionDto> {

  List<TransactionDto> findAllByUserId(Integer userId);
}

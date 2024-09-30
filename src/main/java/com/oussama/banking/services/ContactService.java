package com.oussama.banking.services;

import com.oussama.banking.dto.ContactDto;

import java.util.List;

/**
 * @author oussama othmani
 */
public interface ContactService extends AbstractService<ContactDto> {

  List<ContactDto> findAllByUserId(Integer userId);
}

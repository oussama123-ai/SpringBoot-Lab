package com.oussama.banking.services;

import java.util.List;

/**
 * @author oussama othmani
 */
public interface AbstractService<T> {

  Integer save(T dto);

  List<T> findAll();

  T findById(Integer id);

  void delete(Integer id);

}

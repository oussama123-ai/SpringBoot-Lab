package com.oussama.banking.repositories;

import com.oussama.banking.models.Contact;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author oussama othmani
 */
public interface ContactRepository extends JpaRepository<Contact, Integer> {

  List<Contact> findAllByUserId(Integer userId);
}

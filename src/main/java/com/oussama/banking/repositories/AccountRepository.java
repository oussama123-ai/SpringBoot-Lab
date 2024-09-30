package com.oussama.banking.repositories;

import com.oussama.banking.models.Account;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author oussama othmani
 */
public interface AccountRepository extends JpaRepository<Account, Integer> {

  Optional<Account> findByIban(String iban);

  Optional<Account> findByUserId(Integer id);
}

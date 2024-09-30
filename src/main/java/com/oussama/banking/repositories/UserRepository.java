package com.oussama.banking.repositories;

import com.oussama.banking.models.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author oussama othmani
 */
public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);
}

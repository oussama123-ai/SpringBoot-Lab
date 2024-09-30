package com.oussama.banking.repositories;

import com.oussama.banking.models.Role;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author oussama othmani
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {

  Optional<Role> findByName(String roleName);
}

package com.oussama.banking.repositories;

import com.oussama.banking.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author oussama othmani
 */
public interface AddressRepository extends JpaRepository<Address, Integer> {

}

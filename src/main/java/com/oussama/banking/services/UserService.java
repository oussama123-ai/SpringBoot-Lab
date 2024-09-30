package com.oussama.banking.services;

import com.oussama.banking.dto.AuthenticationRequest;
import com.oussama.banking.dto.AuthenticationResponse;
import com.oussama.banking.dto.LightUserDto;
import com.oussama.banking.dto.UserDto;

/**
 * @author oussama othmani
 */
public interface UserService extends AbstractService<UserDto> {

  Integer validateAccount(Integer id);

  Integer invalidateAccount(Integer id);

  AuthenticationResponse register(UserDto user);

  AuthenticationResponse authenticate(AuthenticationRequest request);

  Integer update(LightUserDto userDto);
}

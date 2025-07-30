package com.system.reservation.demo.service;

import com.system.reservation.demo.dto.UserRequest;
import com.system.reservation.demo.dto.UserResponse;
import com.system.reservation.demo.entity.User;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

  UserResponse createUser(UserRequest userDTo);

  UserResponse getUserById(UUID id);

  UserResponse getUserByEmail(String email);

  Page<UserResponse> getUserList(Pageable pageable);

  UserResponse updateUser(UUID id, UserRequest userDTo);

  void inactiveUser(UUID id);

}

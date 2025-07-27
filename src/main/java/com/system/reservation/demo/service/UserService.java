package com.system.reservation.demo.service;

import com.system.reservation.demo.dto.UserRequest;
import com.system.reservation.demo.dto.UserResponse;
import com.system.reservation.demo.entity.User;
import org.springframework.data.domain.Page;

public interface UserService {

  UserResponse createUser(UserRequest userDTo);

  UserResponse getUserById(String id);

  UserResponse getUserByEmail(String email);

  Page<User> getUserList(int pageNum, int pageSize);

  UserResponse updateUser(UserRequest userDTo);

  void inactiveUser(String id);

}

package com.system.reservation.demo.service.impl;

import com.system.reservation.demo.dto.UserRequest;
import com.system.reservation.demo.dto.UserResponse;
import com.system.reservation.demo.entity.User;
import com.system.reservation.demo.repository.UserRepository;
import com.system.reservation.demo.service.UserService;
import com.system.reservation.demo.utils.mappers.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final UserMapper userMapper;

  @Override
  public UserResponse createUser(UserRequest userDTo) {
    var user = userMapper.userRequestToUser(userDTo);
    var userSaved = userRepository.save(user);
    return userMapper.userToUserResponse(userSaved);
  }

  @Override
  public UserResponse getUserById(String id) {
    return null;
  }

  @Override
  public UserResponse getUserByEmail(String email) {
    return null;
  }

  @Override
  public Page<User> getUserList(int pageNum, int pageSize) {
    return null;
  }

  @Override
  public UserResponse updateUser(UserRequest userDTo) {
    return null;
  }

  @Override
  public void inactiveUser(String id) {

  }
}

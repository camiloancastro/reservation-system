package com.system.reservation.demo.service.impl;

import com.system.reservation.demo.dto.UserRequest;
import com.system.reservation.demo.dto.UserResponse;
import com.system.reservation.demo.entity.User;
import com.system.reservation.demo.entity.enums.UserStateEnum;
import com.system.reservation.demo.repository.UserRepository;
import com.system.reservation.demo.service.UserService;
import com.system.reservation.demo.utils.mappers.UserMapper;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
  public UserResponse getUserById(UUID id) {
    var user = userRepository.findById(id);
    return userMapper.userToUserResponse(user);
  }

  @Override
  public UserResponse getUserByEmail(String email) {
    var  user = userRepository.findByEmail(email);
    return userMapper.userToUserResponse(user);
  }

  @Override
  public Page<UserResponse> getUserList(Pageable pageable) {
    return userRepository.findAll(pageable)
        .map(userMapper::userToUserResponse);
  }

  @Override
  public UserResponse updateUser(UUID id, UserRequest userDTo) {
    var user = userRepository.findById(id);
    userMapper.updateUserFromRequest(userDTo, user);
    User saved = userRepository.save(user);
    return userMapper.userToUserResponse(saved);
  }

  @Override
  public void inactiveUser(UUID id) {
    var user = userRepository.findById(id);
    user.setUserStateEnum(UserStateEnum.INACTIVE);
    userRepository.save(user);
  }

}

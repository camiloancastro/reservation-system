package com.system.reservation.demo.utils.mappers;

import com.system.reservation.demo.dto.UserRequest;
import com.system.reservation.demo.dto.UserResponse;
import com.system.reservation.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

  User userRequestToUser(UserRequest userRequest);
  UserResponse userToUserResponse(User user);

}

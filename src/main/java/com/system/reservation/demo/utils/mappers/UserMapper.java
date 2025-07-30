package com.system.reservation.demo.utils.mappers;

import com.system.reservation.demo.dto.UserRequest;
import com.system.reservation.demo.dto.UserResponse;
import com.system.reservation.demo.entity.User;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

  User userRequestToUser(UserRequest userRequest);
  UserResponse userToUserResponse(User user);
  void updateUserFromRequest(UserRequest dto, @MappingTarget User entity);

}

package com.system.reservation.demo.dto;

import com.system.reservation.demo.entity.enums.UserStateEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UserResponse {

  private String id;
  private String names;
  private String lastName;
  private String email;
  private String phoneNumber;
  private UserStateEnum state;

}

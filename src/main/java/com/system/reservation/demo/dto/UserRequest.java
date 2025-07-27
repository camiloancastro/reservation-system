package com.system.reservation.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

  @NotEmpty
  private String names;

  @NotEmpty
  private String lastName;

  @NotEmpty
  @Email
  private String email;

  private String phoneNumber;

}

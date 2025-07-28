package com.system.reservation.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

  @NotEmpty
  private String name;

  @NotEmpty
  private String lastName;

  @NotEmpty
  @Email
  private String email;

  private String phone;

  private LocalDateTime registerDate = LocalDateTime.now();

}

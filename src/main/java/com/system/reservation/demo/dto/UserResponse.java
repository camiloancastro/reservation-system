package com.system.reservation.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.system.reservation.demo.entity.enums.UserStateEnum;
import java.time.LocalDateTime;
import java.util.UUID;
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

  private UUID id;
  private String name;
  private String lastName;
  private String email;
  private String phone;
  private UserStateEnum userStateEnum;
  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDateTime registerDate;

}

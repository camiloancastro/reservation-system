package com.system.reservation.demo.entity;

import com.system.reservation.demo.entity.enums.UserStateEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

  @Id
  private UUID id;
  private String name;
  private String lastName;
  private String email;
  private String phone;
  private LocalDateTime registerDate = LocalDateTime.now();
  private UserStateEnum userStateEnum;

}

package com.system.reservation.demo.entity;

import com.system.reservation.demo.entity.enums.UserStateEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class User {

  @Id
  private UUID id;
  private String name;
  private String lastName;
  private String email;
  private String phone;
  private LocalDateTime registerDate;
  private UserStateEnum userStateEnum;

}

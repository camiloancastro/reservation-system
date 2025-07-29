package com.system.reservation.demo.entity;

import com.system.reservation.demo.entity.enums.UserStateEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue
  private UUID id;
  private String name;
  private String lastName;
  private String email;
  private String phone;
  private LocalDateTime registerDate;
  @Enumerated(EnumType.STRING)
  @Builder.Default
  private UserStateEnum userStateEnum = UserStateEnum.ACTIVE;

}

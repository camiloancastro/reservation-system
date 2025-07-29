package com.system.reservation.demo.controller;

import com.system.reservation.demo.dto.UserRequest;
import com.system.reservation.demo.dto.UserResponse;
import com.system.reservation.demo.service.UserService;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

  private final UserService userService;

  @PostMapping()
  public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) {
    var userResponse = userService.createUser(userRequest);
    return ResponseEntity.ok(userResponse);
  }

  @PostMapping("/inactive/{id}")
  public ResponseEntity<Void> inactiveUser(@PathVariable UUID id) {
    userService.inactiveUser(id);
    return ResponseEntity.noContent().build();
  }

}

package com.system.reservation.demo.controller;

import com.system.reservation.demo.dto.UserRequest;
import com.system.reservation.demo.dto.UserResponse;
import com.system.reservation.demo.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

  private final UserService userService;

  @PostMapping(produces = "application/json")
  public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) {
    var userResponse = userService.createUser(userRequest);
    return ResponseEntity.ok(userResponse);
  }

  @PostMapping(value = "/inactive/{id}", produces = "application/json")
  public ResponseEntity<Void> inactiveUser(@PathVariable UUID id) {
    userService.inactiveUser(id);
    return ResponseEntity.noContent().build();
  }

  @GetMapping(value = "/{id}", produces = "application/json")
  public ResponseEntity<UserResponse> getUser(@PathVariable UUID id) {
    return  ResponseEntity.ok(userService.getUserById(id));
  }

  @GetMapping(value = "by-email", produces = "application/json")
  public ResponseEntity<UserResponse> getUserByEmail(@RequestParam String email) {
    return  ResponseEntity.ok(userService.getUserByEmail(email));
  }

  @GetMapping(produces = "application/json")
  public ResponseEntity<Page<UserResponse>> getUsers(Pageable pageable) {
    return ResponseEntity.ok(userService.getUserList(pageable));
  }

  @PutMapping(value = "/{id}", produces = "application/json")
  public ResponseEntity<UserResponse> updateUser(@PathVariable UUID id,
      @RequestBody UserRequest userRequest) {
    return  ResponseEntity.ok(userService.updateUser(id, userRequest));
  }


}

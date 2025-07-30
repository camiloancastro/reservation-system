package com.system.reservation.demo.repository;

import com.system.reservation.demo.entity.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  User findById(UUID id);

  User findByEmail(String email);
}

package com.bechir.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bechir.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
  Role findByRole(String role);
}

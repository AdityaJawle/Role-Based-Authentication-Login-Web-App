package com.aj.role.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.role.Model.Users;
import java.util.Optional;


@Repository
public interface RoleDao extends JpaRepository<Users, Integer>{
    Optional<Users>findByUsername(String username);
    Optional<Users>findByEmail(String email);
}
    
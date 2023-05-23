package com.example.springsecurity.Repo;

import com.example.springsecurity.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDataRepo extends JpaRepository<UserData, Integer> {

    Optional<UserData> findByName(String username);
}

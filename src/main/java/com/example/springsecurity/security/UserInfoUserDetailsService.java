package com.example.springsecurity.security;

import com.example.springsecurity.Repo.UserDataRepo;
import com.example.springsecurity.entity.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserInfoUserDetailsService implements UserDetailsService {

    @Autowired private UserDataRepo userDataRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserData> userData=userDataRepo.findByName(username);
        return userData.map(UserInfoUserDetails::new)
                .orElseThrow(()-> new UsernameNotFoundException("username not found" + username));

    }
}

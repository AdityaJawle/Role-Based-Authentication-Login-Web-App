package com.aj.role.Service;

import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aj.role.Dao.RoleDao;
import com.aj.role.Model.Users;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
@AllArgsConstructor
public class RoleService implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(RoleService.class);
    private final RoleDao roleDao;


    public Users save(Users u) {

        if (isEmailRegistered(u.getEmail())) {
            throw new RuntimeException("Email already registered. Please use a different email.");
        }

        return roleDao.save(u);
    }
    
    public boolean isEmailRegistered(String email) {
        Optional<Users> user = roleDao.findByEmail(email);
        return user.isPresent();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> user = roleDao.findByUsername(username);
        if (user.isPresent()) {
            var userObj = user.get();
            return User.builder()
                    .username(userObj.getUsername())
                    .password(userObj.getPassword())
                    .authorities("ROLE_" + userObj.getRole())
                    .build();
        } else {
            logger.error("User not found: {}", username);
            throw new UsernameNotFoundException("User not found: " + username);
        }
    }
}

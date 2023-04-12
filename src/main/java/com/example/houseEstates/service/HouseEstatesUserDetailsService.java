package com.example.houseEstates.service;

import com.example.houseEstates.model.entity.UserEntity;
import com.example.houseEstates.model.entity.UserRoleEntity;
import com.example.houseEstates.model.user.HouseEstatesUserDetails;
import com.example.houseEstates.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class HouseEstatesUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public HouseEstatesUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username)
                .map(this::map)
                .orElseThrow(() -> new UsernameNotFoundException("User with email " + username + " not found!"));
    }

    private UserDetails map(UserEntity user) {
        return new HouseEstatesUserDetails(
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                user.getFirstName(),
                user.getLastName(),
                user.getUserRoles().stream().map(this::map).toList());
    }

    private GrantedAuthority map(UserRoleEntity userRoleEntity) {
        return new SimpleGrantedAuthority("ROLE_" + userRoleEntity.getUserRole().name());
    }
    }


package com.ttn.springSecurityPOC.service;

import com.ttn.springSecurityPOC.MyUserDetails;
import com.ttn.springSecurityPOC.dao.UserRepository;
import com.ttn.springSecurityPOC.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user= userRepository.findByUsername(username);
        if(!user.isPresent())
            throw new UsernameNotFoundException("User not found");
        else
        return user.map(MyUserDetails::new).get();

    }
}

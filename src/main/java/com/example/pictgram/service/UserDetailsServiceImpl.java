package com.example.pictgram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.pictgram.entity.User;
import com.example.pictgram.repository.UserRepository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private UserRepository repository;
	
    @Autowired
    protected static Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	
    	log.debug("username={}", username);
      
    	if (username == null || "".equals(username)) {
            throw new UsernameNotFoundException("Username is empty");
        }
        User entity = repository.findByUsername(username);

        return entity;
    }

}
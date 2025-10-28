package com.mnkhoi.CommuteRace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mnkhoi.CommuteRace.model.UserPrincipal;
import com.mnkhoi.CommuteRace.model.Users;
import com.mnkhoi.CommuteRace.repository.UserRepository;

/**
 * 
 * DaoUserDetailService
 */
@Service
public class DaoUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = repo.findByUsername(username);

		if (user == null) {
			System.out.println("User Not Found");
			throw new UsernameNotFoundException("User not found");
		}

		return new UserPrincipal(user);
	}

}

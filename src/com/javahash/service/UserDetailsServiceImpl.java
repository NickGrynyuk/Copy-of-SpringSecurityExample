package com.javahash.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javahash.dao.UserDao;
import com.javahash.entity.Role;
import com.javahash.entity.User;

@Service("userDetailsService") 
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired private UserDao dao;

    public UserDetails loadUserByUsername(String username)
	      throws UsernameNotFoundException, DataAccessException {

	    User userEntity = dao.loadUsersByUsername(username);
	    if (userEntity == null)
	      throw new UsernameNotFoundException("user not found");

	    return buildUserFromUserEntity(userEntity);
	  }

	  private org.springframework.security.core.userdetails.User 
	  			buildUserFromUserEntity(User userEntity) {

	    String username = userEntity.getName();
	    String password = userEntity.getPassword();
//	    boolean enabled = userEntity.isActive();
//	    boolean accountNonExpired = userEntity.isActive();
//	    boolean credentialsNonExpired = userEntity.isActive();
//	    boolean accountNonLocked = userEntity.isActive();

	    Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	    for (Role role : userEntity.getRoles()) {
	      authorities.add(new GrantedAuthorityImpl(role.getName()));
	    }

	    org.springframework.security.core.userdetails.User user = 
	    		new org.springframework.security.core.userdetails.User(
	    				username, password, true, true, true, true, authorities);
	    return user;
	  }
}

package com.javahash.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.javahash.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        DaoAuthenticationProvider daoAuthenticationProvider =
                new DaoAuthenticationProvider();
        daoAuthenticationProvider
                .setUserDetailsService(userDetailsService);

        auth.authenticationProvider(daoAuthenticationProvider);
	}
 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http
		 .csrf().disable()
      .authorizeRequests()
        
		.antMatchers("/UDB**").access("hasRole('ROLE_USER')")
		
		.antMatchers("/contacts**").access("hasRole('ROLE_USER')")
		
	
	; 
	
		
          
      http    
      .formLogin().defaultSuccessUrl("/index", false)
          .loginPage("/login")
          .permitAll()
          .and()
      .logout()                                    
          .permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/403");
 

	
 
	}
	

}

package org.azhon.auth.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.SneakyThrows;

/**
 * 项目名:    SpringBlade
 * 包名       org.springblade.auth.config
 * 文件名:    WebSecurityConfiguration
 * 创建时间:  2019-05-03 on 19:03
 * 描述:     TODO
 *
 * @author ZJB
 */

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	@SneakyThrows
	protected void configure(HttpSecurity http) {
		http
				.authorizeRequests()
				.antMatchers(
						"/actuator/**",
						"/token/**").permitAll()
				.anyRequest().authenticated()
				.and().csrf().disable();
	}

	@Bean
	@Override
	@SneakyThrows
	public AuthenticationManager authenticationManagerBean() {
		return super.authenticationManagerBean();
	}





	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

}

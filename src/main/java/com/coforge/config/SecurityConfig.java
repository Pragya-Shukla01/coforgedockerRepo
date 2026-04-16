//package com.coforge.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//	
////    private final UserController userController;
////
////	SecurityConfig(UserController userController) {
////		this.userController = userController;
////	}
//
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
//		return http.csrf((csrf)->csrf.disable())
//				.authorizeHttpRequests((auth)->auth.anyRequest().permitAll())
//				.httpBasic(Customizer.withDefaults()).build();
//	}
//}

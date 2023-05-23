//package com.example.springsecurity.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
////@Configuration
////@EnableWebSecurity
////@EnableMethodSecurity
//public class SecurityConfig {
//
////    @Bean
////    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
////        UserDetails admin = User.withUsername("Rajkumar")
////                .password(encoder.encode("Pwd1"))
////                .roles("ADMIN")
////                .build();
////        UserDetails user = User.withUsername("Ashwin")
////                .password(encoder.encode("Pwd2"))
////                .roles("USER")
////                .build();
////        return new InMemoryUserDetailsManager(admin, user);
////    }
//
////    @Bean
////    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////         http.
////                 authorizeHttpRequests((authorize) -> authorize
////                        .anyRequest().authenticated()).httpBasic(Customizer.withDefaults());
////
////        return http.build();
////    }
////    @Bean
////    SecurityFilterChain verify(HttpSecurity http) throws Exception {
////        HttpSecurity user = http
////                .authorizeHttpRequests((authorize) -> authorize
////                        .requestMatchers("/products/getProduct/{id}","/products/addNewUser").hasAuthority("USER")
////                        .anyRequest().authenticated());
////
////
////        return http.build();
////    }
//
////    @Bean
////    public InMemoryUserDetailsManager userDetailsService() {
////        UserDetails user = User
////                .withUsername("user")
////                .password(passwordEncoder().encode("password"))
////                .roles("USER_ROLE")
////                .build();
////        return new InMemoryUserDetailsManager(user);
////    }
//
//
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
//}

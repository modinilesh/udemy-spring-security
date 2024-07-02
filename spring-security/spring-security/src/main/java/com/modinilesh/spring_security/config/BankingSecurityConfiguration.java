package com.modinilesh.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class BankingSecurityConfiguration {

    //Approach 1 is mentioned below which uses withDefaultPasswordEncoder, but it is not recommended approach to use in production as it does not encode the password

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("*/myAccount", "*/myBalance", "*/myCards", "*6/myLoans").authenticated()
                .requestMatchers("*/contact", "*/notices").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin@123")
                .authorities("admin")
                .build();

        UserDetails user2 = User.withDefaultPasswordEncoder()
                .username("nilesh")
                .password("Nilesh@123")
                .authorities("admin")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);
    }

}

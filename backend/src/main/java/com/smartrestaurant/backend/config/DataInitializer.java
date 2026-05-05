package com.smartrestaurant.backend.config;

import com.smartrestaurant.backend.entity.Role;
import com.smartrestaurant.backend.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) {

        if (roleRepository.findByRoleName("USER").isEmpty()) {
            roleRepository.save(new Role(null, "USER"));
        }

        if (roleRepository.findByRoleName("ADMIN").isEmpty()) {
            roleRepository.save(new Role(null, "ADMIN"));
        }

        if (roleRepository.findByRoleName("WAITER").isEmpty()) {
            roleRepository.save(new Role(null, "WAITER"));
        }
    }
}
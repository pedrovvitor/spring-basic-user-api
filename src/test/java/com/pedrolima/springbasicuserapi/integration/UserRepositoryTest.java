package com.pedrolima.springbasicuserapi.integration;

import com.pedrolima.springbasicuserapi.entities.User;
import com.pedrolima.springbasicuserapi.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@ActiveProfiles("test")
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testCreateAndFindUser() {
        User user = new User();
        user.setUsername("testUser");
        user.setPassword("testPass");
        user.setEmail("test@email.com");

        userRepository.save(user);

        Optional<User> foundUser = userRepository.findByUsername("testUser");

        assertTrue(foundUser.isPresent());
        assertEquals(user.getUsername(), foundUser.get().getUsername());
        assertEquals(user.getEmail(), foundUser.get().getEmail());
    }
}

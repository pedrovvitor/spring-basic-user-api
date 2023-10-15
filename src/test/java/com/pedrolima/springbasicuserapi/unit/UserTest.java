package com.pedrolima.springbasicuserapi.unit;

import com.pedrolima.springbasicuserapi.entities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTest {

    @Test
    void onCreate() {
        User user = new User();
        user.onCreate();
        assertNotNull(user.getCreatedAt());
        assertNotNull(user.getUpdatedAt());
    }

    @Test
    void onUpdate() {
        User user = new User();
        user.onUpdate();
        assertNotNull(user.getUpdatedAt());
    }
}

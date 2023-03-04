package edu.goit.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getName() {
        User user = new User();
        user.setName("Yevgen");
        assertEquals("Yevgen", user.getName());
    }

    @Test
    void getLastName() {
        User user = new User();
        user.setLastName("Galamaga");
        assertEquals("Galamaga", user.getLastName());
    }
}
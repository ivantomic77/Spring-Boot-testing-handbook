package dev.tomic.testingmasterclass.chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch2UserServiceTest {
    private Ch2UserService userService;
    private Ch2UserRepository userRepository;

    public Ch2UserServiceTest() {
        this.userRepository = new Ch2UserRepository();
        this.userService = new Ch2UserService(userRepository);
    }

    @Test
    void should_return_user_Rick() {
        assertEquals("123", userService.getByName("Rick"));
    }
}
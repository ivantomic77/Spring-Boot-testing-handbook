package dev.tomic.testingmasterclass.chapter2;

import org.springframework.stereotype.Service;

@Service
public class Ch2UserService {
    private Ch2UserRepository userRepository;

    public Ch2UserService(Ch2UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getByName(String name) {
        return userRepository.getUser(name);
    }
}

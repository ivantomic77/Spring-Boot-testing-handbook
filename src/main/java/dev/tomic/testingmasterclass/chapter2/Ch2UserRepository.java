package dev.tomic.testingmasterclass.chapter2;

import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public class Ch2UserRepository {
    public String getUser(String name) {
        if (Objects.equals(name, "Rick")) {
            return "123";
        }
        return null;
    }
}

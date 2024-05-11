package dev.tomic.testingmasterclass.chapter3;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
public class Ch3License {
    private String name;
    private Integer age;
    @Setter
    private LocalDate createdAt;

    public Ch3License(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

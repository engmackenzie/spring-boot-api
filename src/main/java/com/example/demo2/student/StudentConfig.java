package com.example.demo2.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mjamal@email.com",
                    LocalDate.of(2000, Month.APRIL, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@email.com",
                    LocalDate.of(1995, Month.APRIL, 5)

            );

            repository.saveAll(List.of(mariam, alex));
        };
    }
}

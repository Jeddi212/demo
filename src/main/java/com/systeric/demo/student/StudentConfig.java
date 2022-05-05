package com.systeric.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jeddi = new Student(
                    "Jeddi",
                    "jeddi@gmail.com",
                    LocalDate.of(2001, FEBRUARY, 28)
            );

            Student fanuel = new Student(
                    "Fanuel",
                    "fan@gmail.com",
                    LocalDate.of(2004, FEBRUARY, 29)
            );

            repository.saveAll(
                    List.of(jeddi, fanuel)
            );
        };
    }
}

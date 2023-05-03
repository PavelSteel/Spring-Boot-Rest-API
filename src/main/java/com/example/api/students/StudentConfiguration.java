package com.example.api.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {
    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            studentRepository.saveAll(List.of(
                    new Student("Pavel", LocalDate.of(1989, Month.APRIL, 19)),
                    new Student("Alex", LocalDate.of(1989, Month.MARCH, 9))));
        };
    }
}

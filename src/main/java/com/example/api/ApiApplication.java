package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
	@GetMapping(path = "students")
	public List<Student> list(){
		return List.of(
				new Student("Pavel", LocalDate.of(1989, Month.APRIL, 19)),
				new Student("Alex", LocalDate.of(1989, Month.MARCH, 9)));
	}
}

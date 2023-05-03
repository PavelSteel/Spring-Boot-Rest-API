package com.example.api.students;

import com.example.api.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping(path = "students")
    public List<Student> list(){
        return List.of(
                new Student("Pavel", LocalDate.of(1989, Month.APRIL, 19)),
                new Student("Alex", LocalDate.of(1989, Month.MARCH, 9)));
    }
}

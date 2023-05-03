package com.example.api.students;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> list(){
        return List.of(
                new Student("Pavel", LocalDate.of(1989, Month.APRIL, 19)),
                new Student("Alex", LocalDate.of(1989, Month.MARCH, 9)));
    }
}

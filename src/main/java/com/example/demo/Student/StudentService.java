package com.example.demo.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service  //This annotation makes this class a spring bean. Meaning it can be instantiated
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,"Emmanuel","Emmanuel@gmail.com", LocalDate.of(2000, Month.APRIL, 8),21)
             //   new Student(2L,"Thomas","Thomas@gmail.com", LocalDate.of(2000, Month.APRIL, 8),21)
        );
    }
}

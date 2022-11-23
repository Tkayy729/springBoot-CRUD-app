package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args ->{
            Student thomas =   new Student("Thomas","Thomas@gmail.com", LocalDate.of(2000, APRIL, 8));
            Student emmanuel = new Student("Emmanuel","Emmanuel@gmail.com", LocalDate.of(2001, APRIL, 8));
            repository.saveAll(List.of(thomas, emmanuel));
        };
    }
}

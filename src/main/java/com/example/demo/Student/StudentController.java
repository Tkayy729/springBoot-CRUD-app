package com.example.demo.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired  // Creating an instance of the service controller class anytime the constructor is called
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

  @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
  }

    @PostMapping
    public void registerStudent(@RequestBody Student student){
         studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void removeStudent(@PathVariable Long studentId){
        studentService.removeStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email
    ){
        studentService.updateStudent(studentId,name,email);
    }


}

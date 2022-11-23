package com.example.demo.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Data access layer
 */

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

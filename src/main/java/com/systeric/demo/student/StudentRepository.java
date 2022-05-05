package com.systeric.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Class Name , Type of ID
public interface StudentRepository extends JpaRepository<Student, Long> {
}

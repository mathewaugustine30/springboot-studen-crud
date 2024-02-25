package com.mathew.student.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mathew.student.studentcrud.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}


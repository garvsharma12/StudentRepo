package com.basicCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basicCrud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

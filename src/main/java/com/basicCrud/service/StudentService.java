package com.basicCrud.service;

import java.util.List;
import java.util.Optional;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import com.basicCrud.entity.Student;
import com.basicCrud.repository.StudentRepository;

@Service 
public class StudentService {
    
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        Student savedStudent = studentRepository.save(student);
        return savedStudent;
    }

    public Student getStudent(Long id) {
        Optional<Student> studentResp = studentRepository.findById(id);
        if(studentResp.isPresent()) {
            return studentResp.get();
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

package com.example.student.management.system.service;

import com.example.student.management.system.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student s);

    Student getStudentById(Long id);

    Student updateStudent(Student s);

    void deleteStudentById(Long id);
}

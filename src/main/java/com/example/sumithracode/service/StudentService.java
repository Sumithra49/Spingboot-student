package com.example.sumithracode.service;

import com.example.sumithracode.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student>getAllStudents();
}

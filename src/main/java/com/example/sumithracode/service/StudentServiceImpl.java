package com.example.sumithracode.service;

import com.example.sumithracode.model.Student;
import com.example.sumithracode.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student){
        //save the data into db
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

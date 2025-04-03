package com.example.classroomapi.Repository;

import com.example.classroomapi.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryStudent extends JpaRepository<Student, Integer> {
}
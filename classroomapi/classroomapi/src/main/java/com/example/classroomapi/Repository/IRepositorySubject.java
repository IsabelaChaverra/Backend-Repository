package com.example.classroomapi.Repository;

import com.example.classroomapi.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorySubject extends JpaRepository<Subject, Integer> {
}
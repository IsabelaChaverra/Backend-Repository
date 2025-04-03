package com.example.classroomapi.Repository;

import com.example.classroomapi.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCourse extends JpaRepository<Course, Integer> {
}


package com.example.classroomapi.Repository;

import com.example.classroomapi.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryRegistration extends JpaRepository<Registration, Integer> {
}
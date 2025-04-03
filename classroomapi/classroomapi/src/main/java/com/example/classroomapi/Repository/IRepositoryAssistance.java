package com.example.classroomapi.Repository;

import com.example.classroomapi.models.Assistance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAssistance extends JpaRepository<Assistance, Integer> {
}
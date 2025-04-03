package com.example.classroomapi.Repository;

import com.example.classroomapi.models.Docent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryDocent extends JpaRepository<Docent, Integer> {
}

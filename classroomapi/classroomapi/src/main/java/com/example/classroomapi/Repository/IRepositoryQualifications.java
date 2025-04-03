package com.example.classroomapi.Repository;

import com.example.classroomapi.models.Qualifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryQualifications extends JpaRepository<Qualifications, Integer> {
}

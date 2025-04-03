package com.example.classroomapi.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "docent")
public class Docent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer docent_id;

    private String specialty;

    @OneToMany(mappedBy = "docent")
    private List<Subject> subjects;

    public Docent() {}

    public Docent(Integer docent_id, String specialty) {
        this.docent_id = docent_id;
        this.specialty = specialty;
    }

    public Integer getDocent_id() {
        return docent_id;
    }

    public void setDocent_id(Integer docent_id) {
        this.docent_id = docent_id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}

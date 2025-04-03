package com.example.classroomapi.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subject_id;

    private String name_Subject;

    @ManyToOne
    @JoinColumn(name = "docent_id", nullable = false)
    private Docent docent;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private List<Qualifications> qualifications;

    public Subject() {}

    public Subject(Integer subject_id, String name_Subject) {
        this.subject_id = subject_id;
        this.name_Subject = name_Subject;
    }

    public Integer getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }

    public String getName_Subject() {
        return name_Subject;
    }

    public void setName_Subject(String name_Subject) {
        this.name_Subject = name_Subject;
    }

    public Docent getDocent() {
        return docent;
    }

    public void setDocent(Docent docent) {
        this.docent = docent;
    }

    public List<Qualifications> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<Qualifications> qualifications) {
        this.qualifications = qualifications;
    }
}

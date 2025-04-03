package com.example.classroomapi.models;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_id;

    private Date birthdate;
    private Integer grade;
    private String direction;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Registration> registrations;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Qualifications> qualifications;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Assistance> assistances;

    public Student() {}

    public Student(Integer student_id, Date birthdate, Integer grade, String direction) {
        this.student_id = student_id;
        this.birthdate = birthdate;
        this.grade = grade;
        this.direction = direction;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }

    public List<Qualifications> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<Qualifications> qualifications) {
        this.qualifications = qualifications;
    }

    public List<Assistance> getAssistances() {
        return assistances;
    }

    public void setAssistances(List<Assistance> assistances) {
        this.assistances = assistances;
    }
}

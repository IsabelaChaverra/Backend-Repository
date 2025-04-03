package com.example.classroomapi.models;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "registration")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer registration_id;

    private Timestamp registration_date;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Registration() {}

    public Registration(Integer registration_id, Timestamp registration_date) {
        this.registration_id = registration_id;
        this.registration_date = registration_date;
    }

    public Integer getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(Integer registration_id) {
        this.registration_id = registration_id;
    }

    public Timestamp getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Timestamp registration_date) {
        this.registration_date = registration_date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

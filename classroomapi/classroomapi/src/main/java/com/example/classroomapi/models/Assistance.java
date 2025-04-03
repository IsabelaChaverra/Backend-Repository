package com.example.classroomapi.models;

import com.example.classroomapi.help_package.Type_assistance;
import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "assistance")
public class Assistance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer assistance_id;
    private Date date;

    @Enumerated(EnumType.STRING)
    private Type_assistance type_assistance;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    public Assistance() {}

    public Assistance(Integer assistance_id, Date date, Type_assistance type_assistance, Student student) {
        this.assistance_id = assistance_id;
        this.date = date;
        this.type_assistance = type_assistance;
        this.student = student;
    }

    public Integer getAssistance_id() {
        return assistance_id;
    }

    public void setAssistance_id(Integer assistance_id) {
        this.assistance_id = assistance_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Type_assistance getType_assistance() {
        return type_assistance;
    }

    public void setType_assistance(Type_assistance type_assistance) {
        this.type_assistance = type_assistance;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

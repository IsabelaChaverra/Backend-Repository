package com.example.classroomapi.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "qualifications")
public class Qualifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer qualifications_id;

    private BigDecimal note;
    private Date evaluation_date;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    public Qualifications() {}

    public Qualifications(Integer qualifications_id, BigDecimal note, Date evaluation_date) {
        this.qualifications_id = qualifications_id;
        this.note = note;
        this.evaluation_date = evaluation_date;
    }

    public Integer getQualifications_id() {
        return qualifications_id;
    }

    public void setQualifications_id(Integer qualifications_id) {
        this.qualifications_id = qualifications_id;
    }

    public BigDecimal getNote() {
        return note;
    }

    public void setNote(BigDecimal note) {
        this.note = note;
    }

    public Date getEvaluation_date() {
        return evaluation_date;
    }

    public void setEvaluation_date(Date evaluation_date) {
        this.evaluation_date = evaluation_date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}

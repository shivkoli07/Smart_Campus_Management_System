package com.smartcampus.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "complaints")
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String subCategory;

    private String studentName;
    private String department;
    private String rollNo;

    @Column(length = 1000)
    private String description;

    private String status; // NOT_VIEWED, IN_PROGRESS, SOLVED

    private boolean anonymous;

    // 🔹 Constructor
    public Complaint() {
        this.status = "NOT_VIEWED";
    }

    // 🔹 Getters & Setters

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getStudentName() {
        return anonymous ? "Anonymous" : studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return anonymous ? "Hidden" : department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRollNo() {
        return anonymous ? "Hidden" : rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }
}

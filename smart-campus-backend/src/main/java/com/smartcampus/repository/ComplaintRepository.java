package com.smartcampus.repository;

import com.smartcampus.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {

    // For tracking complaints by roll number
    List<Complaint> findByRollNo(String rollNo);
}

package com.smartcampus.repository;

import com.smartcampus.entity.LeaveApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LeaveRepository extends JpaRepository<LeaveApplication, Long> {

    List<LeaveApplication> findByRollNo(String rollNo);
}

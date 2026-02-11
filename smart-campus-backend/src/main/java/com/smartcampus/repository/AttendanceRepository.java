package com.smartcampus.repository;

import com.smartcampus.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

    List<Attendance> findByRollNo(String rollNo);

    List<Attendance> findByRollNoAndSubject(String rollNo, String subject);
}

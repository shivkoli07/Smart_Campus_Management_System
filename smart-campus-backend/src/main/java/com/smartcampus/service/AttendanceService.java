package com.smartcampus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartcampus.entity.Attendance;
import com.smartcampus.repository.AttendanceRepository;

import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository repository;

    public Attendance saveAttendance(Attendance attendance) {
        return repository.save(attendance);
    }

    public List<Attendance> getByRollNo(String rollNo) {
        return repository.findByRollNo(rollNo);
    }
}

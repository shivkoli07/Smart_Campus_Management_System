package com.smartcampus.controller;

import com.smartcampus.entity.Attendance;
import com.smartcampus.repository.AttendanceRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/attendance")
@CrossOrigin
public class AttendanceController {

    private final AttendanceRepository repo;

    public AttendanceController(AttendanceRepository repo) {
        this.repo = repo;
    }

    // ADMIN → SAVE ATTENDANCE
    @PostMapping
    public String saveAttendance(@RequestBody List<Map<String, String>> data) {

        for (Map<String, String> row : data) {

            String rollNo = row.get("rollNo");
            String name = row.get("name");
            LocalDate date = LocalDate.parse(row.get("date"));

            saveOne(rollNo, name, "Maths IV", row.get("mathsIV"), date);
            saveOne(rollNo, name, "OS", row.get("os"), date);
            saveOne(rollNo, name, "CN", row.get("cn"), date);
            saveOne(rollNo, name, "Open Elective", row.get("openElective"), date);
        }

        return "Attendance saved successfully";
    }

    private void saveOne(String rollNo, String name, String subject, String status, LocalDate date) {
        Attendance a = new Attendance();
        a.setRollNo(rollNo);
        a.setName(name);
        a.setSubject(subject);
        a.setStatus(status);
        a.setDate(date);
        repo.save(a);
    }

    // STUDENT → VIEW ATTENDANCE
    @GetMapping("/student/{rollNo}")
    public List<Attendance> getStudentAttendance(@PathVariable String rollNo) {
        return repo.findByRollNo(rollNo);
    }
}

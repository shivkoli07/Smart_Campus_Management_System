package com.smartcampus.controller;

import com.smartcampus.entity.Complaint;
import com.smartcampus.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin(origins = "*")
public class ComplaintController {

    @Autowired
    private ComplaintRepository repository;

    // 1️⃣ FILE COMPLAINT
    @PostMapping("/submit")
    public Complaint submitComplaint(@RequestBody Complaint complaint) {

        if (complaint.isAnonymous()) {
            complaint.setStudentName(null);
            complaint.setDepartment(null);
            complaint.setRollNo(null);
        }

        complaint.setStatus("NOT_VIEWED");
        return repository.save(complaint);
    }

    // 2️⃣ VIEW ALL COMPLAINTS (ADMIN)
    @GetMapping("/all")
    public List<Complaint> getAllComplaints() {
        return repository.findAll();
    }

    // 3️⃣ UPDATE STATUS (ADMIN)
    @PutMapping("/update-status/{id}")
    public Complaint updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {

        Complaint complaint = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Complaint not found"));

        complaint.setStatus(status);
        return repository.save(complaint);
    }

    // 4️⃣ TRACK COMPLAINT (STUDENT)
    @GetMapping("/track/{rollNo}")
    public List<Complaint> trackComplaint(@PathVariable String rollNo) {
        return repository.findByRollNo(rollNo);
    }
}

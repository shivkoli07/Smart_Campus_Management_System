package com.smartcampus.controller;

import com.smartcampus.entity.LeaveApplication;
import com.smartcampus.service.LeaveService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/leave")
@CrossOrigin
public class LeaveController {

    private final LeaveService service;

    public LeaveController(LeaveService service) {
        this.service = service;
    }

    // STUDENT APPLY
    @PostMapping
    public LeaveApplication apply(@RequestBody LeaveApplication leave) {
        return service.applyLeave(leave);
    }

    // ADMIN VIEW ALL
    @GetMapping
    public List<LeaveApplication> getAll() {
        return service.getAll();
    }

    // STUDENT VIEW
    @GetMapping("/student/{rollNo}")
    public List<LeaveApplication> getByRoll(@PathVariable String rollNo) {
        return service.getByRollNo(rollNo);
    }

    // ADMIN UPDATE STATUS
    @PutMapping("/{id}/status")
    public void updateStatus(@PathVariable Long id,
                             @RequestBody Map<String, String> body) {
        service.updateStatus(id, body.get("status"));
    }
}

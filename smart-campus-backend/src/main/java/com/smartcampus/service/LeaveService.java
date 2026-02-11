
package com.smartcampus.service;

import com.smartcampus.entity.LeaveApplication;
import com.smartcampus.repository.LeaveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveService {

    private final LeaveRepository repo;

    public LeaveService(LeaveRepository repo) {
        this.repo = repo;
    }

    public LeaveApplication applyLeave(LeaveApplication leave) {
        leave.setStatus("PENDING");
        return repo.save(leave);
    }

    public List<LeaveApplication> getAll() {
        return repo.findAll();
    }

    public List<LeaveApplication> getByRollNo(String rollNo) {
        return repo.findByRollNo(rollNo);
    }

    public void updateStatus(Long id, String status) {
        LeaveApplication leave = repo.findById(id).orElseThrow();
        leave.setStatus(status);
        repo.save(leave);
    }
}

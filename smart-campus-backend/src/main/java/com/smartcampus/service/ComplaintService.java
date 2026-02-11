package com.smartcampus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartcampus.entity.Complaint;
import com.smartcampus.repository.ComplaintRepository;

import java.util.List;

@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository repository;

    public Complaint saveComplaint(Complaint complaint) {
        complaint.setStatus("Not Viewed");
        return repository.save(complaint);
    }

    public List<Complaint> getAll() {
        return repository.findAll();
    }
}

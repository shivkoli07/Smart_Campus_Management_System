package com.smartcampus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartcampus.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {}

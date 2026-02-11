package com.smartcampus.entity;

import jakarta.persistence.*;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rating;
    private String suggestion;
    private String name;

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRating() { return rating; }
    public void setRating(String rating) { this.rating = rating; }

    public String getSuggestion() { return suggestion; }
    public void setSuggestion(String suggestion) { this.suggestion = suggestion; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

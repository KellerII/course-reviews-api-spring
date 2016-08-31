package com.thoughtstreamllc.review;

import com.thoughtstreamllc.core.BaseEntity;
import com.thoughtstreamllc.course.Course;
import com.thoughtstreamllc.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review extends BaseEntity {
    private int rating;
    private String description;
    @ManyToOne
    private Course course;
    @ManyToOne
    private User reviewer;

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    protected Review() {
        super();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getReviewer() { return reviewer; }

    public void setReviewer(User reviewer) { this.reviewer = reviewer; }
}

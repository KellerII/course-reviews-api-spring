package com.thoughtstreamllc.review;

import com.thoughtstreamllc.core.BaseEntity;
import com.thoughtstreamllc.course.Course;

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

    public Course getCourse() {
        return course;
    }

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    protected Review() {
        super();
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
}

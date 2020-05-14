package com.sandipgole.Hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    private int id;

    private LocalDateTime localDateTime;
    @ManyToOne
    private User user;
    private String details;

    public Post()
    {

    }

    public Post(int id, LocalDateTime localDateTime, User user, String details) {
        this.id = id;
        this.localDateTime = localDateTime;
        this.user = user;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

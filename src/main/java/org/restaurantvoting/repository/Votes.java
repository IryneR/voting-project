package org.restaurantvoting.repository;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
    @Table(name="votes")
    // This tells Hibernate to make a table out of this class
    public class Votes {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column(name="votes_id")
        private Integer votesId;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
        private User userId;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
        @Column(name="restaurant_id")
        public Restaurants restaurantId;

        @Column(name="votes_date")
        public LocalDateTime votesDate;

    public Integer getVotesId() {
        return votesId;
    }

    public void setVotesId(Integer votesId) {
        this.votesId = votesId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Restaurants getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Restaurants restaurantId) {
        this.restaurantId = restaurantId;
    }

    public LocalDateTime getVotesDate() {
        return votesDate;
    }

    public void setVotesDate(LocalDateTime votesDate) {
        this.votesDate = votesDate;
    }
}

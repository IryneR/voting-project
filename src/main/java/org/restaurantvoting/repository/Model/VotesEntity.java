package org.restaurantvoting.repository.Model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
    @Table(name="votes")
    // This tells Hibernate to make a table out of this class
    public class VotesEntity {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column(name="votes_id")
        private Integer votesId;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
        private UserEntity userId;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
        @Column(name="restaurant_id")
        public RestaurantsEntity restaurantId;

        @Column(name="votes_date")
        public LocalDateTime votesDate;

    public Integer getVotesId() {
        return votesId;
    }

    public void setVotesId(Integer votesId) {
        this.votesId = votesId;
    }

    public UserEntity getUserId() {
        return userId;
    }

    public void setUserId(UserEntity userId) {
        this.userId = userId;
    }

    public RestaurantsEntity getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(RestaurantsEntity restaurantId) {
        this.restaurantId = restaurantId;
    }

    public LocalDateTime getVotesDate() {
        return votesDate;
    }

    public void setVotesDate(LocalDateTime votesDate) {
        this.votesDate = votesDate;
    }
}

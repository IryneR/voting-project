package org.restaurantvoting.modelTO;

import javax.persistence.*;
import java.time.LocalDateTime;


    public class VotesTO {

        private Integer votesId;
        private UserTO userId;
        public RestaurantsTO restaurantId;
        public LocalDateTime votesDate;

    public Integer getVotesId() {
        return votesId;
    }

    public void setVotesId(Integer votesId) {
        this.votesId = votesId;
    }

    public UserTO getUserId() {
        return userId;
    }

    public void setUserId(UserTO userId) {
        this.userId = userId;
    }

    public RestaurantsTO getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(RestaurantsTO restaurantId) {
        this.restaurantId = restaurantId;
    }

    public LocalDateTime getVotesDate() {
        return votesDate;
    }

    public void setVotesDate(LocalDateTime votesDate) {
        this.votesDate = votesDate;
    }
}

package org.restaurantvoting.repository;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="restaurants")
// This tells Hibernate to make a table out of this class
 public class Restaurants {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="restaurant_id")
    private Integer restaurantId;

    @Column(name="restaurant_name")
    private String restaurantName;

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}

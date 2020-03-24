package org.restaurantvoting.service.api;

import org.restaurantvoting.repository.model.MenuEntity;
import org.restaurantvoting.repository.model.RestaurantsEntity;

import java.util.List;

public interface RestaurantService {
    RestaurantsEntity addRestaurant(RestaurantsEntity restaurant);
    void delete(Integer id);
    RestaurantsEntity  getByName(String name);
    RestaurantsEntity  editRestaurant(RestaurantsEntity  restaurant);
    List<RestaurantsEntity> getAll();
}

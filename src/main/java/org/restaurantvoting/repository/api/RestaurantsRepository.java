package org.restaurantvoting.repository.api;

import org.restaurantvoting.repository.model.RestaurantsEntity;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantsRepository extends CrudRepository<RestaurantsEntity,Integer> {
}

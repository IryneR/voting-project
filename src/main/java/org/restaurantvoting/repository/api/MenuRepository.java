package org.restaurantvoting.repository.api;

import org.restaurantvoting.repository.model.MenuEntity;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<MenuEntity,Integer> {
}

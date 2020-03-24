package org.restaurantvoting.repository.api;

import org.restaurantvoting.repository.model.MenuItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface MenuItemRepository extends CrudRepository<MenuItemEntity,Integer> {
}

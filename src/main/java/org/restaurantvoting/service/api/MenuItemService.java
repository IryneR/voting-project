package org.restaurantvoting.service.api;

import org.restaurantvoting.repository.model.MenuItemEntity;

import java.util.List;


public interface MenuItemService {
    MenuItemEntity addMenuItem(MenuItemEntity menuItem);
    void delete(Integer id);
    MenuItemEntity getByName(String name);
    MenuItemEntity  editMenuItem(MenuItemEntity  menuItem);
    List<MenuItemEntity> getAll();

}

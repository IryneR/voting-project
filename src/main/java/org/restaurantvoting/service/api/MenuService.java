package org.restaurantvoting.service.api;

import org.restaurantvoting.repository.model.MenuEntity;
import org.restaurantvoting.repository.model.UserEntity;

import java.util.List;

public interface MenuService {
        MenuEntity addMenu(MenuEntity menu);
        void delete(Integer id);
        MenuEntity  getByName(String name);
        MenuEntity  editMenu(MenuEntity  menu);
        List<MenuEntity> getAll();
}

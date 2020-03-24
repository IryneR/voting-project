package org.restaurantvoting.modelTO;

import org.restaurantvoting.repository.Model.MenuItemEntity;
import org.restaurantvoting.repository.Model.RestaurantsEntity;

import javax.persistence.*;
import java.util.Set;



    public class MenuTO {

        private Integer menuId;
        private String menuName;
        private RestaurantsEntity restaurantId;
        private Set<MenuItemEntity> menuItems;

    public Set<MenuItemEntity> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(Set<MenuItemEntity> menuItems) {
        this.menuItems = menuItems;
    }

    public Integer getMenuId() {
            return menuId;
        }

        public void setMenuId(Integer menuId) {
            this.menuId = menuId;
        }

        public String getMenuName() {
            return menuName;
        }

        public void setMenuName(String menuName) {
            this.menuName = menuName;
        }

        public RestaurantsEntity getRestaurantId() {
            return restaurantId;
        }

        public void setRestaurantId(RestaurantsEntity restaurantId) {
            this.restaurantId = restaurantId;
        }
    }

package org.restaurantvoting.repository.Model;

import javax.persistence.*;
import java.util.Set;


@Entity
    @Table(name="menu")
// This tells Hibernate to make a table out of this class
    public class MenuEntity {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column(name="menu_id")
        private Integer menuId;

        @Column(name="menu_name")
        private String menuName;

    @ManyToOne
    @JoinColumn(name="restaurant_id", nullable=false)
        private RestaurantsEntity restaurantId;

        @OneToMany(mappedBy="menu")
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

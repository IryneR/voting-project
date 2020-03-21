package org.restaurantvoting.repository;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
    @Table(name="menu_item")
// This tells Hibernate to make a table out of this class
    public class MenuItem {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column(name="menu_item_id")
        private Integer menuItemId;

        @Column(name="menu_item_name")
        private String menuItemName;

        @Column(name="menu_item_price")
        private BigDecimal menuItemPrice;

    @ManyToOne
    @JoinColumn(name="menu_id", nullable=false)
        private Menu menuId;


    public Integer getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(Integer menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public BigDecimal getMenuItemPrice() {
        return menuItemPrice;
    }

    public void setMenuItemPrice(BigDecimal menuItemPrice) {
        this.menuItemPrice = menuItemPrice;
    }

    public Menu getMenuId() {
        return menuId;
    }

    public void setMenuId(Menu menuId) {
        this.menuId = menuId;
    }
}

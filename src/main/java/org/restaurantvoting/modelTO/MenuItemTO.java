package org.restaurantvoting.modelTO;

import javax.persistence.*;
import java.math.BigDecimal;



    public class MenuItemTO {

        private Integer menuItemId;
        private String menuItemName;
        private BigDecimal menuItemPrice;
        private MenuTO menuId;


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

    public MenuTO getMenuId() {
        return menuId;
    }

    public void setMenuId(MenuTO menuId) {
        this.menuId = menuId;
    }
}

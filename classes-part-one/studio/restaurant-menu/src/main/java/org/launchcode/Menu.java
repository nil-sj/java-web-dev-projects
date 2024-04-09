package org.launchcode;

import java.util.Date;
import java.util.ArrayList;
public class Menu {
    private Date menuDate;
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        menuDate = new Date();
        menuItems = new ArrayList<>();
    }

    public Menu(ArrayList<MenuItem> menuItems) {
        menuDate = new Date();
        this.menuItems = menuItems;
    }

    public Date getMenuDate() {
        return menuDate;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setDate(Date menuDate) {
        this.menuDate = menuDate;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        // add code to auto-update the menuDate also...
    }

    public void addMenu(MenuItem item) {
        menuItems.add(item);
        // add code to auto-update the menuDate also...
    }


}

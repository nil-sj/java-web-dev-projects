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

    // a way to print out a menu - similar to the toString method:
    public String toString() {
        String menuReport = "MENU\n====";
        menuReport += "\nMenu Date: " + getMenuDate() + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        for (MenuItem item : menuItems) {
            menuReport += String.format("\n%s", item.toString());
            menuReport += "\n----------------------------------------";
        }
        menuReport += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        return menuReport;
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
        menuDate = new Date();
    }

    public void addMenu(MenuItem item) {
        // Bonus Mission - TO BE ADDED - to not create duplicity of item, check if the item is not there in the list already, and then only add...
        // TO BE ADDED...
        menuItems.add(item);
        // add code to auto-update the menuDate also...
        menuDate = new Date();
    }

    public void deleteMenuItem(MenuItem item) {
        // ideally, should validate if that item is there in the menu, and then only remove... but here for the sake of time, let's just delete it.
        menuItems.remove(item);
        menuDate = new Date();
    }


}

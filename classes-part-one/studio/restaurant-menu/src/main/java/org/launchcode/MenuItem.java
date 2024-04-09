package org.launchcode;

import java.util.Date;
public class MenuItem {
    private double price;
    private String description;
    private String category;

    private Date menuItemDate;
    private boolean newItem;

    private static String[] validCategories = { "appetizer", "main course", "dessert" };

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        // apply validation before assigning category
        this.category = category;
        menuItemDate = new Date();
        this.newItem = true;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNewItem() {
        // calculate based on current dates and menuItemDate and then only do the return...
        return newItem;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        // use validation and then add categories.
        this.category = category;
    }

    // no need for setNewItem() but we can do updateNewItem()???


}

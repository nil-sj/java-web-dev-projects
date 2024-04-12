package org.launchcode;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
public class MenuItem {
    private double price;
    private String description;
    private String category;

    private Date menuItemDate;
    private boolean newItem;

    private static String[] validCategories = { "appetizer", "main course", "dessert" };
    public static int noveltyThresholdDays = 10;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        // apply validation before assigning category
        this.category = category;
        menuItemDate = new Date();
        this.newItem = true;
    }

    // a way to print out a single menu item - similar to toString method:
    public String toString() {
        String menuItemReport = String.format("$%.2f : %s [%s]", price, description, category);
        menuItemReport += isNewItem() ? " -- NEW" : "";
        return menuItemReport;
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        MenuItem theMenuItem = (MenuItem) toBeCompared;
        return theMenuItem.getDescription() == getDescription();
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
        long currentTimeMilliS = System.currentTimeMillis();
        long thresholdTimeMilliS = noveltyThresholdDays * 24 * 60 * 60 * 1000L;
        long menuDateMilliS = menuItemDate.getTime();

        if (menuDateMilliS + thresholdTimeMilliS >= currentTimeMilliS) {
            setNewItem(true);
        } else {
            setNewItem(false);
        }
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
        List<String> categories = Arrays.asList(validCategories);
        boolean valid = categories.contains(category);
        if (valid) {
            this.category = category;
        } else {
            System.out.println("Error! Invalid category passed.");
        }
    }

    // no need for setNewItem() but we can do updateNewItem()??? //// or should I just add it???
    private void setNewItem(boolean isNew) {
        newItem = isNew;
    }


}

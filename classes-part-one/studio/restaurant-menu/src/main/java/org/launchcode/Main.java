package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // instantiating a new menu:
        Menu testMenu = new Menu();

        // looking at the new born menu:
        System.out.println(testMenu.toString());

        // creating a few menu items:
        MenuItem pizza = new MenuItem(13.75, "Perpperoni Pizza", "main course");
        MenuItem pudding = new MenuItem(3.50, "Banana Pudding", "dessert");
        MenuItem soup = new MenuItem(4.25, "Tomato Soup", "appetizer");
        MenuItem kebab = new MenuItem(8.50, "Lamb Shashlik", "appetizer");
        MenuItem pasta = new MenuItem(12.50, "Chicken Piccata", "main course");

        // looking at one menu item:
        System.out.println("\nTesting a single menu item....");
        System.out.println(pudding.toString());
        System.out.println("\n");

        // adding the above menu items to the menu, and printing it out again
        testMenu.addMenu(pizza);
        testMenu.addMenu(pasta);
        testMenu.addMenu(pudding);
        testMenu.addMenu(kebab);
        testMenu.addMenu(soup);
        System.out.println("\nTaking a fresh look at the menu....\n");
        System.out.println(testMenu.toString());
        System.out.println("\n");

        // now, let's delete a single item from the menu...
        System.out.println("\nDeleting the following item:");
        System.out.println(kebab.toString());
        System.out.println("\n");
        testMenu.deleteMenuItem(kebab);
        System.out.println("After deleting the above, let's print the menu again:\n");
        System.out.println(testMenu.toString());

    }
}

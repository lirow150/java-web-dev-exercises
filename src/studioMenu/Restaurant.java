package studioMenu;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem salmon = new MenuItem("Salmon", 45.00, "Grilled Salmon with green beans", "main", true);
        MenuItem chicken = new MenuItem("Chicken", 26.00, "Grilled Chicken with asparagus", "main", true);

        Menu menu = new Menu();
        menu.addMenuItem(salmon);
        menu.addMenuItem(chicken);

        for (MenuItem item: menu.getMenuItems()) {
            System.out.println(item.getName());
        }

        menu.setLastUpdated();
        System.out.println(menu.getLastUpdated());
        System.out.println(menu);

        menu.printMenuItem(salmon);


    }
}

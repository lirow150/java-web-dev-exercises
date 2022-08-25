package studioMenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private final ArrayList<MenuItem> menuItems = new ArrayList<>();
        private LocalDate lastUpdated;

        public void addMenuItem(MenuItem item) {
            this.menuItems.add(item);
        }

        public ArrayList<MenuItem> getMenuItems() {
            return menuItems;
        }

        public LocalDate getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated() {
            this.lastUpdated = LocalDate.now();
        }

        public void printMenuItem (MenuItem item){
            System.out.println(item.getName());
            System.out.println(item.getCategory());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
        }

//loop though arrayList, use for loop


}

//app main dessert
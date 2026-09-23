import java.util.ArrayList;

public class Inventory {
    private String playerName;
    private ArrayList<Item> items;
    private int maxCapacity;

    Inventory(String playerName, int maxCapacity) {
        this.playerName = playerName;
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (items.size() < maxCapacity){
            items.add(item);
            System.out.println(playerName + " got " + item.getName());
        }
    }

    public int getTotalValue() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getValue();
        }
        return sum;
    }

    public Item findItemByType(String type) {
        for (Item item : items) {
            if (item.getType().equalsIgnoreCase(type)) {
                return item;
            }
        }
        return null;
    }

    public void printInventory() {
        System.out.println(playerName);
        System.out.println("Capacity: " + items.size() + "/" + maxCapacity);
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("Total value: " + getTotalValue());
    }
}

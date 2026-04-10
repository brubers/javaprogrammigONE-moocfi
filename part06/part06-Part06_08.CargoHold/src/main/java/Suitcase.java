import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item){
        if (totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }


    @Override
    public String toString() {
        if (items.size() == 0) {
            return "no items (" + totalWeight() + " kg)";
        } else if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }
        return items.size() + " items (" + totalWeight() + " kg)";
    }
}

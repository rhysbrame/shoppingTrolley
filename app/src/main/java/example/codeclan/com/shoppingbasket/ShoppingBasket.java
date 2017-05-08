package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;

public class ShoppingBasket {

    private int basketNumber;
    private ArrayList<Item> trolley;

    public ShoppingBasket(int basketNumber){
        this.basketNumber = basketNumber;
        this.trolley = new ArrayList<>();
    }

    public void setBasketNumber(int number){
        basketNumber = number;
    }

    public int getBasketNumber(){
        return basketNumber;
    }

    public void addItem(Item item){
        trolley.add(item);
    }

    public Item getItem() {
        for (Item item : trolley) {
            return item;
        }
        return null;
    }

    public int checkTrolleySize(){
        return trolley.size();
    }

    public void emptyTrolley(){
        trolley.clear();
    }

    public int getIndex(Item item){
        return trolley.indexOf(item);
    }

    public String findItemByIndex(int index){
        Item indexItem = trolley.get(index);
        return indexItem.getItemName();
    }

    public void removeItemByIndex(int index){
        trolley.remove(index);
    }

    public String findItemByName(String itemName){
        for (Item individualItem : trolley){
            if (individualItem.getItemName() == itemName){
                return individualItem.getItemName();
            }
        }
        return null;
    }

    public void removeItemByName(String itemName){
        for (Item individualItem : trolley){
            if (individualItem.getItemName() == itemName){
                int index = getIndex(individualItem);
                trolley.remove(index);
            }
        }
    }

    public double getTrolleyTotal(){
        double total = 0.00;
        for (Item item : trolley){
            double itemCost = item.getItemCost();
            total = total + itemCost;
    }
        return total;
    }

    public ArrayList<Item> getTrolley(){
        return new ArrayList<>(trolley);
    }

}
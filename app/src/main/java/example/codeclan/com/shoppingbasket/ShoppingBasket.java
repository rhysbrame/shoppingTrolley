package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;

public class ShoppingBasket {

    private int basketNumber;
    private ArrayList<Item> trolley;

    public ShoppingBasket(int basketNumber){
        this.basketNumber = basketNumber;
        this.trolley = new ArrayList<>();
    }
// get and set the basket number in case i want to make a shop class
    public void setBasketNumber(int number){
        basketNumber = number;
    }

    public int getBasketNumber(){
        return basketNumber;
    }
// add an item into the array list trolley
    public void addItem(Item item){
        trolley.add(item);
    }
// checking the size via the common .size method that belongs to the list array class
    public int checkTrolleySize(){
        return trolley.size();
    }
// clearing the trolley via .clear method
    public void emptyTrolley(){
        trolley.clear();
    }
// find an item by index and also removing the item via the index
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

    public int getIndex(Item item){
        return trolley.indexOf(item);
    }

    public void removeItemByName(String itemName){
        for (Item individualItem : trolley){
            if (individualItem.getItemName() == itemName){
                int index = getIndex(individualItem);
                trolley.remove(index);
            }
        }
    }
}

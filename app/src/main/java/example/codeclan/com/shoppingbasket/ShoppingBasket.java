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

    public int checkTrolleySize(){
        return trolley.size();
    }

    public void emptyTrolley(){
        trolley.clear();
    }

    public Item findItemByIndex(int index){
        Item indexItem = trolley.get(index);
        return indexItem;
    }

    public void removeItemByIndex(int index){
        trolley.remove(index);
    }

    // TODO do i need this...
    public Item listItems(){
        for ( Item itemList : trolley ) {
            return itemList;
        }
        return null;
    }

    public Item findItemByName(String name){

    }

    // TODO public void removeItemByName(Item item)
    public void removeItemByName(){

    }
}

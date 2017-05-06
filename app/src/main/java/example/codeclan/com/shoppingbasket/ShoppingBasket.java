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

    public void removeItemByIndex(int index){
        trolley.remove(index);
    }

//  TODO  public void removeItemByName(Item item)
}

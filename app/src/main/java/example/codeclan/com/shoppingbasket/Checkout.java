package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;

public class Checkout implements Discountable{

    private ShoppingBasket newShoppingBasket;
    private ArrayList<Item> trolley;

    public Checkout(ShoppingBasket newShoppingBasket){
        this.newShoppingBasket = newShoppingBasket;
        this.trolley = new ArrayList<>();
    }

    public double getBasketTotal(){
        double total = 0.00;
        ArrayList<Item> trolley = newShoppingBasket.getTrolley();
            for (Item item : trolley) {
                double itemCost = item.getItemCost();
                total = total + itemCost;
            }
        return total;
    }
}

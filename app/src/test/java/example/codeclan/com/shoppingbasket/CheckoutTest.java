package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.shoppingbasket.ItemType.*;
import static junit.framework.Assert.assertEquals;

public class CheckoutTest {

    Checkout newCheckout;
    ShoppingBasket newShoppingBasket;
    Item newItem1;Item newItem2;Item newItem3;Item newItem4;Item newItem5;

    @Before
    public void before(){
        newShoppingBasket = new ShoppingBasket(12);
        newItem1 = new Item(DAIRY, 0.99, "milk");
        newItem2 = new Item(BUTCHERS, 4.99, "meat");
        newItem3 = new Item (FISH, 2.45, "shark");
        newItem4 = new Item (DRY, 2.00, "papers");
        newItem5 = new Item (BAKERY, 1.00, "bread");
        newCheckout = new Checkout(newShoppingBasket);
    }

    @Test
    public void testGetTrolleyTotal() {
        newShoppingBasket.addItem(newItem1);
        newShoppingBasket.addItem(newItem2);
        newShoppingBasket.addItem(newItem3);
        assertEquals(8.43, newCheckout.getBasketTotal());
    }
}

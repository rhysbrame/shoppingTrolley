package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.shoppingbasket.ItemType.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNull;

public class ShoppingBasketTest {

    ShoppingBasket newShoppingBasket;
    Item newItem;

    @Before
    public void before(){
        newShoppingBasket = new ShoppingBasket(1);
        newItem = new Item(DAIRY, 0.99, "milk");

    }

    @Test
    public void testShoppingBasketNumber(){
        assertEquals(1, newShoppingBasket.getBasketNumber());
        newShoppingBasket.setBasketNumber(2);
        assertEquals(2, newShoppingBasket.getBasketNumber());
    }

    @Test
    public void testAddItem(){
        newShoppingBasket.addItem(newItem);
        assertEquals(1, newShoppingBasket.checkTrolleySize());
    }

    @Test
    public void testAdd3Items(){
        newShoppingBasket.addItem(newItem);
        newShoppingBasket.addItem(newItem);
        newShoppingBasket.addItem(newItem);
        assertEquals(3, newShoppingBasket.checkTrolleySize());
    }

    @Test
    public void testRemoveItemByIndex(){
        newShoppingBasket.addItem(newItem);
        newShoppingBasket.addItem(newItem);
        newShoppingBasket.addItem(newItem);
        newShoppingBasket.addItem(newItem);
        newShoppingBasket.addItem(newItem);
        assertEquals(5, newShoppingBasket.checkTrolleySize());

        newShoppingBasket.removeItemByIndex(0);
        assertEquals(4, newShoppingBasket.checkTrolleySize());

        //TODO increase the testing on this part, so that we can prove that the methods are actually doing what i want them to do.
    }


}
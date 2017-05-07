package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.shoppingbasket.ItemType.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class ShoppingBasketTest {

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
    }

    @Test
    public void testShoppingBasketNumber(){
        assertEquals(12, newShoppingBasket.getBasketNumber());
        newShoppingBasket.setBasketNumber(22);
        assertEquals(22, newShoppingBasket.getBasketNumber());
    }

    @Test
    public void testAddItem(){
        newShoppingBasket.addItem(newItem1);
        assertEquals(1, newShoppingBasket.checkTrolleySize());
    }

    @Test
    public void testAddMultipleItems(){
        newShoppingBasket.addItem(newItem1);
        newShoppingBasket.addItem(newItem2);
        newShoppingBasket.addItem(newItem3);
        assertEquals(3, newShoppingBasket.checkTrolleySize());
    }

    @Test
    public void testGetItem(){
        newShoppingBasket.addItem(newItem1);
        newShoppingBasket.addItem(newItem2);
        assertEquals(newItem2, newShoppingBasket.getItem());
    }

    @Test
    public void testEmptyTrolley(){
        newShoppingBasket.addItem(newItem1);
        newShoppingBasket.addItem(newItem2);
        newShoppingBasket.addItem(newItem3);
        assertEquals(3, newShoppingBasket.checkTrolleySize());
        newShoppingBasket.emptyTrolley();
        assertEquals(0, newShoppingBasket.checkTrolleySize());
    }

    @Test
    public void testFindItemByIndex(){
        newShoppingBasket.addItem(newItem1);
        assertEquals("milk", newShoppingBasket.findItemByIndex(0));
        newShoppingBasket.addItem(newItem2);
        newShoppingBasket.addItem(newItem3);
        String itemName = newShoppingBasket.findItemByIndex(2);
        assertEquals("shark", itemName);
    }

    @Test
    public void testRemoveItemByIndex(){
        newShoppingBasket.addItem(newItem1);
        newShoppingBasket.addItem(newItem2);
        newShoppingBasket.addItem(newItem3);
        newShoppingBasket.addItem(newItem4);
        newShoppingBasket.addItem(newItem5);
        assertEquals(5, newShoppingBasket.checkTrolleySize());

        newShoppingBasket.removeItemByIndex(0);
        assertEquals(4, newShoppingBasket.checkTrolleySize());
    }

    @Test
    public void testFindItemByName(){
        newShoppingBasket.addItem(newItem5);
        assertEquals("bread", newShoppingBasket.findItemByName("bread"));
    }

    @Test
    public void testGetIndex(){
        newShoppingBasket.addItem(newItem1);
        newShoppingBasket.addItem(newItem2);
        newShoppingBasket.addItem(newItem3);
        assertEquals(2,newShoppingBasket.getIndex(newItem3));
    }

    @Test
    public void testRemoveItemByName(){
        newShoppingBasket.addItem(newItem1);
        newShoppingBasket.addItem(newItem2);
        newShoppingBasket.addItem(newItem3);
        newShoppingBasket.removeItemByName("meat");
        assertNull(newShoppingBasket.findItemByName("meat"));
    }

    @Test
    public void testGetTrolleyTotal() {
        newShoppingBasket.addItem(newItem1);
        newShoppingBasket.addItem(newItem2);
        newShoppingBasket.addItem(newItem3);
        assertEquals(8.43, newShoppingBasket.getTrolleyTotal());
    }
}
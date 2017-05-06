package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.shoppingbasket.ItemType.*;
import static junit.framework.Assert.assertEquals;

public class ItemTest {

    Item newItem;

    @Before
    public void before(){
        newItem = new Item(DAIRY, 0.99, "milk");
    }

    @Test
    public void testItemType(){
        assertEquals(DAIRY, newItem.getItemType());
        newItem.setItemType(BAKERY);
        assertEquals(BAKERY, newItem.getItemType());
    }

    @Test
    public void testItemCost(){
        assertEquals(0.99, newItem.getItemCost());
        newItem.setItemCost(0.89);
        assertEquals(0.89, newItem.getItemCost());
    }

    @Test
    public void testItemName(){
        assertEquals("milk", newItem.getItemName());
        newItem.setItemName("cream");
        assertEquals("cream", newItem.getItemName());
    }
}
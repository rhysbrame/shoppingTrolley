package example.codeclan.com.shoppingbasket;

public class Item {

    private ItemType itemType;
    private double itemCost;
    private String itemName;


    public Item(ItemType itemType, double itemCost, String itemName){
        this.itemType = itemType;
        this.itemCost = itemCost;
        this.itemName = itemName;
    }

    public void setItemType(ItemType type){
        itemType = type;
    }

    public ItemType getItemType(){
        return itemType;
    }

    public void setItemCost(double cost){
        itemCost = cost;
    }

    public double getItemCost(){
        return itemCost;
    }

    public void setItemName(String name){
        itemName = name;
    }

    public String getItemName(){
        return itemName;
    }

}

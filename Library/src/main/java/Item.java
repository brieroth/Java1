import java.util.ArrayList;

public abstract class Item {
    private int itemID;
    private String itemAisle;


    public Item(Integer itemID, String itemAisle)
    {
        this.itemID = itemID;
        this.itemAisle = itemAisle;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemAisle() {
        return itemAisle;
    }

    public void setItemAisle(String itemColour) {
        this.itemAisle = itemColour;
    }

   @Override
    public String toString() {
        return "Item{" +
                "itemID=" + itemID +
                ", itemAisle='" + itemAisle + '\'' +
                '}';
    }
}


import java.util.ArrayList;

public class ItemHandler {
    private ArrayList<Item> itemList = new ArrayList<Item>();

    //add items
    public void addItem(Item item) {
        itemList.add(item);
    }

    //remove items
    private void remItem(Item item) {
        itemList.remove(item);
    }



//
//    public void searchArray(Item item) {
//        for (Item itm : itemList) {
//            if (itm instanceof Book){
//                System.out.println("testingg book loop");
//                System.out.println(itm);
//
//            }
//        }
//    }

    @Override
    public String toString() {
        return "ItemHandler" + itemList;
    }



}








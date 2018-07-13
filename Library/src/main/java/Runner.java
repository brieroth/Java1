import java.util.ArrayList;

public class Runner {
    public void main(String[] args) {
        ItemHandler itemList = new ItemHandler();
        MemberHandler memberList = new MemberHandler();
//********************************************************************************************************************************************************************************
        //Books
        Book b1 = new Book(1001, "blue", "life changes", "inspirational", false);
        Book b2 = new Book(1002, "green", "King Arthur", "history", false);
        //itemList.addItem(new Book(1001, "blu", "life", "inspo", false));
        //Newspaper
        Newspaper n1 = new Newspaper(2023, "grey", "The Guardian", 2018);
        Newspaper n2 = new Newspaper(2024, "purple", "Daily Mail", 2018);
        //Journal
        Journal j1 = new Journal(3025, "black", "Last Moments Of Shakespeare", 2009, "English Literature");
        Journal j2 = new Journal(3026, "black", " Truth about Hamlet", 1999, "English Literature");
        //Members
        Member m1 = new Member("Deana Kroy", 102, "24 Peaches Street");
        Member m2 = new Member("Otis Browm", 103, "98 Primrose Close");
//********************************************************************************************************************************************************************************
        memberList.addMember(m1);
        memberList.addMember(m2);
        itemList.addItem(b1);
        itemList.addItem(b2);
        itemList.addItem(n1);
        itemList.addItem(n2);
        itemList.addItem(j1);
        itemList.addItem(j2);
        System.out.println(itemList);
        System.out.println(memberList);
        System.out.println(searchArray(3026,itemList));

    }


        public Item searchArray(int itemID, ItemHandler itemList) {
            for (Item itm : itemList) {
                if (itm instanceof Book){

                    System.out.println("testingg book loop");
                    return itm;

                }
            }
            return null;
        }
            }





















//Items
//Book b1 = new Book(1001, "green", "Hunger Games", "Fictional");
// Newspaper n1 = new Newspaper(2023,"grey", "The Guardian", 2018);
// Journal j1 = new Journal(3025, "black", "Last Moments Of Shakespeare",2009, "English Literature" );
// itemList.addItem(b1);
//itemList.addItem(n1);
//itemList.addItem(j1);

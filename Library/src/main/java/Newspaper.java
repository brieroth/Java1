public class Newspaper extends Item{
    private String paperName;
    private int paperYear;

public Newspaper(int itemID, String itemAisle,String paperName, int paperYear){
    super(itemID, itemAisle);
    this.paperName = paperName;
    this.paperYear = paperYear;
}

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public int getPaperYear() {
        return paperYear;
    }

    public void setPaperYear(int paperYear) {
        this.paperYear = paperYear;
    }

    @Override
    public String toString() {
        return "Newspaper{" +  "ID: " + getItemID() + " " + "Aisle: " + getItemAisle() + " " +
                "Name='" + paperName + '\'' +
                ",Year=" + paperYear +
                '}';
    }
}

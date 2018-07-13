public class Journal extends Item {
    private String journalName;
    private int journalYear;
    private String journalGenre;


    public Journal(int itemID, String itemAisle, String journalName, int journalYear, String journalGenre){
        super(itemID, itemAisle);
        this.journalName = journalName;
        this.journalYear = journalYear;
        this.journalGenre = journalGenre;

    }


    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public int getJournalYear() {
        return journalYear;
    }

    public void setJournalYear(int journalYear) {
        this.journalYear = journalYear;
    }

    public String getJournalGenre() {
        return journalGenre;
    }

    public void setJournalGenre(String journalGenre) {
        this.journalGenre = journalGenre;
    }

    @Override
    public String toString() {
        return "Journal{"  + "ID: " +  getItemID() + " " + "Aisle: " + getItemAisle() + " " +
                "Name='" + journalName + '\'' +
                ", Year=" + journalYear +
                ", Genre='" + journalGenre + '\'' +
                '}';
    }
}

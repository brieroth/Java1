
public class Motorcycle extends Vehicle{

    private int noTyres;
    private int helmet;
    private int engSize;

    public Motorcycle(String make, String colour, int modelYr, int noTyres, int helmet, int engSize)
    {
        super(make, colour, modelYr);
    }

    public int getNoTyres() {
        return noTyres;
    }

    public void setNoTyres(int noTyres) {
        this.noTyres = noTyres;
    }

    public int getHelmet() {
        return helmet;
    }

    public void setHelmet(int helmet) {
        this.helmet = helmet;
    }

    public int getEngSize() {
        return engSize;
    }

    public void setEngSize(int engSize) {
        this.engSize = engSize;
    }
}

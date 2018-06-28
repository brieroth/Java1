import java.util.Scanner;

public abstract class Vehicle {

        private String make ;
        private String colour;
        private int modelYr;

        public Vehicle(String make, String colour, int modelYr)
        {
            this.make = make;
            this.colour = colour;
            this.modelYr = modelYr;
        }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getModelYr() {
        return modelYr;
    }

    public void setModelYr(int modelYr) {
        this.modelYr = modelYr;
    }


    @Override
    public String toString() {
        return ("Make of car:" + make + " "+ "Colour of car:" + colour + " " + "Model Year:" + modelYr);
        }
}











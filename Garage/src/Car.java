
public class Car extends Vehicle {
    //inherited attributes
    //individual attributes

   // public static void main(String[] args){}
   private int regNo;
   private int seats;
   private int tyreSize;

   public Car(String make, String colour, int modelYr, int regNo, int seats, int tyreSize)
   {
       super(make,colour,modelYr);
   }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public int getRegNo() {return regNo;}

    public int getSeats() {return seats;}

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(int tyreSize) {
        this.tyreSize = tyreSize;
    }

}






































/*
    public Car (int modelYr, String name, int seats){
        this.modelYr =  modelYr;
        this.name = name;
        this.seats = seats;
      }
            public int getModelYr(){
            return modelYr;
            }

            public String getName(){
            return name;
            }

            public int getSeats(){
                return seats;
             }


*/


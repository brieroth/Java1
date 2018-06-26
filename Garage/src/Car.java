public class Car {
    private int modelYr;
    String name;
    private int seats;

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




}
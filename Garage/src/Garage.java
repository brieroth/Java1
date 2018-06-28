//garage to calculate the bill of each vehicle type
import java.util.ArrayList;

public class Garage {
    private int pricePerHour;   //declare variable of price
    private ArrayList<Vehicle> vehicles = new ArrayList<>(); //create an array list for all vehicles

    //generate and declare p as garage price per hour
    Garage(int p) {
        this.pricePerHour = p;
    }

    //add vehicles created
    void addVehicle(Vehicle v) {
        vehicles.add(v);
    }
    private void remVehicle(Vehicle v){
        vehicles.remove(v);
    }

    //BILL CALCULATION; create array to store prices to vehicle based on seats and model yr
    ArrayList<String> calculateBill() {

        ArrayList<String> prices = new ArrayList<>();

        int bill;
        for (Vehicle veh : vehicles) {

            if (veh instanceof Car) {
                bill = (pricePerHour + ((Car) veh).getSeats()) * veh.getModelYr();
                prices.add("The cost of the job on the " + veh.getMake() + " " + veh.getClass().getName() + " is " + bill);
               // remVehicle(veh);
            }

            if (veh instanceof Motorcycle) {
                bill = (pricePerHour + ((Motorcycle) veh).getEngSize()) * veh.getModelYr();
                prices.add("The cost of the job on the " + veh.getMake() + " " + veh.getClass().getName() + " is " + bill);
                //remVehicle(veh);

            }
        }
        return prices;

    }

        }














//generate an array list to store all makes of vehicles
//    public ArrayList<Vehicle> serchByMake(String make){
//        ArrayList<Vehicle> searchedVehicles = new ArrayList<Vehicle>();
//
//        for ( int i = 0; i < this.vehicles.size(); i++){
//            if (this.vehicles.get(i).getMake().toLowerCase().contains((make.toLowerCase()))) {
//                searchedVehicles.add(this.vehicles.get(i));
//            }
//        }
//        return searchedVehicles;
//    }
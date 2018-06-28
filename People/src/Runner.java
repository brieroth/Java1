import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        //generate and implement into constructor People
        People pers1 = new People("Mike", 34, "IT Consultant");
        People pers2 = new People("Steve", 21, "Gardener");
        People pers3 = new People("Nancy", 45, "Janitor");

        //create array to store object values generated above
        ArrayList<People> peeps = new ArrayList<>();
        peeps.add(pers1); //new people added to array peeps
        peeps.add(pers2);
        peeps.add(pers3);

        System.out.println(peeps);  //print array to check values
        //below prints out details of the person if name is found in the array else return null
        System.out.println(allPeople("Nan", peeps));
    }

    // create allPeople method from the class People and loop within the array to get name if exists during search.
    public static People allPeople(String name, ArrayList<People> peeps ){
        for (People p : peeps) {
            if (p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
}



// System.out.println(pers1.name +" "+ pers1.age + " "+ pers1.jobTitle);
//System.out.println(pers2.name +" "+ pers2.age + " "+ pers2.jobTitle);
//pers1.walk();
// pers2.walkAgain();
// System.out.println(pers2.walkAgain());​
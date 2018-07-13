import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        personArray();
    }


    public static void personArray() {
        ArrayList<Person> pers = new ArrayList();
        Person p1 = new Person("Nancy Knowles", "Consultant", 23);
        Person p2 = new Person("Kenny Rogers", "Musician", 64);
        Person p3 = new Person("Francis Breaux", "Programmer", 26);
        Person p4 = new Person("Evie Payne", "Analyst", 43);
        Person p5 = new Person("Otis West", "Marketing", 29);
        pers.add(p1);
        pers.add(p2);
        pers.add(p3);
        pers.add(p4);
        pers.add(p5);
    }

}

       // Create a loop to iterate through the ArrayList, writing each object to one file,
        // recommended IO library is BufferedWriter (Think about how you format this)










        //Separately, create another ArrayList and populate it with the data from the file you just created.
        // Recommended IO library is BufferedReader (You’re going to have to parse it back in the format you wrote it in, use String.split())







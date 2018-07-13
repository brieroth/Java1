import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int salery;
    private List<Person> people;

    public Person(String name, int salery) {
        this.name = name;
        this.salery = salery;
        people = new ArrayList<Person>();
    }

    public void add(Person p) {
        people.add(p);
    }

    public void remove(Person p) {
        people.remove(p);
    }

    public List<Person> people() {
        return people;
    }

    public String toString() {
        return "Name" + name + "Salary" + salery;
    }



}



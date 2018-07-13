public class Controller {

    public static void main(String[] args) {

        // Setup objects
        Person CEO = new Person(" Name1 ", 30);
        Person trainer = new Person(" matt ", 5);
        Person student = new Person( " bob ", 10);

        // Hierarchy
        CEO.add(trainer);
        trainer.add(student);
        // Student cannot add nothing.


        for(Person t: CEO.people()) {
            System.out.println("Trainers" + t);

            for(Person s: t.people() ) {
                System.out.println("Students" + s);
            }
        }
    }
}

public class People {

    private String name;
    int age;
    String jobTitle;

    public People(String a, int b, String c) {
        this.name = a;
        this.age = b;
        this.jobTitle = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return ("Name:" + this.name + " "+ "Age:" + this.age + " " + "Job:" + this.jobTitle);
    }
}





 /*public void walk() {
        System.out.println("Walk like a person");
    }
    public int walkAgain() {
        System.out.println("Walk like a person Again");
        return 999;
    } */
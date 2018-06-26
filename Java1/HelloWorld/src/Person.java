//create a class to call in the main code HelloWorld
public class Person {

    String name;
    int age;
    String jobTitle;

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }
}

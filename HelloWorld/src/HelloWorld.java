public class HelloWorld {

    public static void main(String[] args) {
        //hello world as a variable
        String hW = "Hello World";
        System.out.println(hW);


        //call other methods
        hWorld();
        hWorld2();
        testW1("brie");
        System.out.println(methodA());
        array();
        array2();

                    //person class implemented
        Person person1 = new Person();
        person1.setAge(23);
        person1.setName("naomi");
        person1.setJobTitle("tester");

        Person person2 = new Person();
        person2.setAge(21);
        person2.setName("bob");
        person2.setJobTitle("developer");
        //System.out.println("Name: " + person1.getName() + " Age: " + person1.getAge() + " Job: " + person1.getJobTitle());

        System.out.println(calcMethod(20,100));
        System.out.println(calcMethod(30,200));
    }

    static void hWorld() {
        System.out.println("Hello");
    }

    static void hWorld2() {
        System.out.println("World");
    }

    static void testW1(String name) {
        System.out.println("Hello " + name);
    }

    // return value
    static String methodA() {
        return "Hi World";
    }

   /* PARAMETERS Create a method that accepts two integers as parameters, then returns an integer
    that is a sum of the two integers given, then call this method from your main method

    CONDITIONALS Modify your method from the previous task to accept another parameter, a
    Boolean, which if it is true, the method will return a sum of the two numbers, and if
    it is false it will return the multiplication of the two numbers.
     */

  public static int calcMethod (int a, int b ){
      Boolean isTest = false;
      if (isTest) {
          return a + b;
      }
      else {
          return a * b;
      }
  }

    /*ARRAYS*/

    static void array() {
        int[] arrayOfInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // print value in position 2
        System.out.println(arrayOfInts[2]);
        //loop and print each value in array
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.println(arrayOfInts[i] + " ");
        }
    }



    /*Create a for loop that populates an integer array with values, outputting them at
    each iteration. Then create another loop that iterates through the array, changing
    the values at each point to equal itself times 10, outputting them at each iteration.*/
    static void array2() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i : nums) {
            System.out.println("Number: " + i);
        }
            for (int i : nums) {
                int b = i * i;
                System.out.println("Number: " + b);
            }
        }
    }



































































//operators and conditionals
//    static void calcMethod(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter first number:");
//        int x = sc.nextInt();
//        System.out.println("enter second number:");
//        int y = sc.nextInt();
//        //if true
//        int z = x + y;
//        //if false
//        int b = x * y;
//        //boolean
//        boolean isTrue = true;
//        //conditional statement
//        if (isTrue) {
//
//            System.out.println("Parameter is true so result: " + z);
//        }
//        else {
//            System.out.println("Parameter is false so result: " + b);
//        }
//        if
//    }






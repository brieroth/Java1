public class HelloWorld {

    public static void main(String[] args) {
        //hello world as a variable
      /*String hW = "Hello World";
        System.out.println(hW);


        //call other methods
        hWorld();
        hWorld2();
        testW1("brie");
        System.out.println(methodA());
        array();
        array2();
        */



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

        //System.out.println(calcMethod(20,100));
        //System.out.println(calcMethod(30,200));
        //System.out.println(uniqueSum(2,2,2));
        //System.out.println(blackjack(19,20));
        System.out.println(tooHot(76));
        //TooHot(26, true);


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

  /*----------------------------------------------------------------------------------------------------
  -------------LEVEL 2 INTERMEDIATE------------------------------*/


     //BLACKJACK*********
    static int blackjack(int a, int b) {
        //if both values are equal to 21 return 0
        if (a == 21 && b == 21) {
            return 0;
        }

        // if a is less than or equal to 21 and b is less than 21 and a, return a
       if (a <=21 && b < 21 && b < a){
            return a;
       }
       if (a <= 21 && b > 21) {
            return a;
        }

        // if b is less than or equal to 21 and a is less than 21 and b, return b
        if (b <=21 && a < 21 && a < b){
            return b;
        }
        if (b <= 21 && a > 21) {
            return b;
        }
        else {
            return 0;
        }
    }


    //UNIQUE SUM *********

    static int uniqueSum(int a, int b, int c) {

        if (a == b && b == c ) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        }
        if (a==c) {
            return b;
        }
        return 0;
    }


   // TOO HOT?
    static int tooHot(int a) {
        Boolean isSummer = true;

        if (a >= 60 && a <= 90) {
            if (isSummer = true) {
                System.out.println("Summer bby");
                return (a);

            }
        } else {
            return 0;
        }

        return 0;
    }

    public static boolean TooHot(int temperature, boolean
    isSummer){

        	if(isSummer) {
            	if(temperature>=60&& temperature <=90) {
                		return true;
                	}
            	}
        	return false;


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






public class Assessment {


    public static void main(String[] args) {
        //doubleChar("The");
        endsly("oddly");
        System.out.println(bunnyEars(4, 2));
        System.out.println(nTwice("Chocolate", 3));

    }

    // Given a string, return a string where
    // for every char in the original,
    // there are two chars.

    // doubleChar("The") → "TThhee"
    // doubleChar("AAbb") → "AAAAbbbb"
    // doubleChar("Hi-There") → "HHii--TThheerree"

    public static String doubleChar(String input) {
        System.out.println(input.length());

        for (int i = 0; i < input.length(); i++) {
            String[] words = input.split(" ");
            //
            // for (int x = 1; x < words.length; x++) {
            System.out.println(words);


        }
        return input;
    }





    //****************************************************************************************************
    //
    // A sandwich is two pieces of bread with something in between. Return the
    // string that is between the first and last appearance of "bread" in the
    // given string, or return the empty string "" if there are not two pieces
    // of bread.

    // getSandwich("breadjambread") → "jam"
    // getSandwich("xxbreadjambreadyy") → "jam"
    // getSandwich("xxbreadyy") → ""
    // getSandwich("xxbreadhoneybreadyy") → "honey"

    public String getSandwich(String input) {

        String a = "bread";
        String b = "bread";
        String c = "jam";
        String d = " ";
        String e = (a + c + b);

        System.out.println(e);

        for (int i = 0; i < 0; i++) {
            if (!c.equals("bread")) {
                System.out.println(c);
                return c;
            }

        }

        return " ";
    }


//****************************************************************************************************
    // Given three ints, a b c, one of them is small, one is medium and one is
    // large. Return true if the three values are evenly spaced, so the
    // difference between small and medium is the same as the difference between
    // medium and large.

    // evenlySpaced(2, 4, 6) → true
    // evenlySpaced(4, 6, 2) → true
    // evenlySpaced(4, 6, 3) → false

    public boolean evenlySpaced(int a, int b, int c) {

        for (int i = 0; i>0; i++){

        }






        return false;
    }


//****************************************************************************************************

    // Given a string and an int n, return a string made of the first and last n
    // chars from the string. The string length will be at least n.

    // nTwice("Hello", 2) → "Helo"
    // nTwice("Chocolate", 3) → "Choate"
    // nTwice("Chocolate", 1) → "Ce"

    public static String nTwice(String input, int a) {
        String str = input;
        String firstTwo = input.substring(0,a);
        String lastChar= input.substring(input.length() - a);
        String output = firstTwo.concat(lastChar);

        return output;
    }



//****************************************************************************************************

    public static boolean endsly(String input) {
        boolean ends = true;
        if (ends) {
            if (input.substring(input.length() - 2).contains("ly")) {
                System.out.println("contains ly");
                return true;
            }
        }
        System.out.println("does not contain ly");
        return false;
        }

    // Given a string, return true if it ends in "ly".

    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    // endsLy("l") → false
//****************************************************************************************************

// Given a string, return recursively a "cleaned" string where adjacent
    // chars that are the same have been reduced to a single char. So "yyzzza"
    // yields "yza".

    // stringClean("yyzzza") → "yza"
    // stringClean("abbbcdd") → "abcd"
    // stringClean("Hello") → "Helo"
    public String stringClean(String input) {
        return "";
    }




//****************************************************************************************************

    // The fibonacci sequence is a famous bit of mathematics, and it happens to
    // have a recursive definition. The first two values in the sequence are 0
    // and 1 (essentially 2 base cases). Each subsequent value is the sum of the
    // previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
    // 21 and so on. Define a recursive fibonacci(n) method that returns the nth
    // fibonacci number, with n=0 representing the start of the sequence.

    // fibonacci(0) → 0
    // fibonacci(1) → 1
    // fibonacci(2) → 1
    // fibonacci(3) → 2
    // fibonacci(4) → 3
    // fibonacci(5) → 5
    // fibonacci(6) → 8
    // fibonacci(25) → 75025

    public int fibonacci(int input) {
        return -1;
    }


 //****************************************************************************************************

    // We have a number of bunnies and each bunny has two big floppy ears. We
    // want to compute the total number of ears across all the bunnies
    // recursively (without loops or multiplication).
    // bunnyEars(0) → 0
    // bunnyEars(1) → 2
    // bunnyEars(2) → 4
    // bunnyEars(4) → 8
    // bunnyEars(16) → 32

    public static int bunnyEars(int input, int y) {
        //y initialises number of bunny ears;
        //input is the amount of bunnies
        //recursion

        if (input == 0 || y ==0 ){
            return 0;
        }
        else if (y > 0) {
            return input + bunnyEars(input, y-1);
        }
        //recursion
        return -bunnyEars(input, -y);
    }



//****************************************************************************************************

    // Given a string, return the length of the largest "block" in the string.
    // A block is a run of adjacent chars that are the same.

    // superBlock("jeffbert") → 2
    // superBlock("abbCCCddBBBxx") → 3
    // superBlock("") → 0

    public int superBlock(String str) {
        return -1;

    }

}









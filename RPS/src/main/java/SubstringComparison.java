import java.util.Scanner;

public class SubstringComparison {


    public static void main(String[] args) {



        String str1 = "hello";

        String test = str1.substring(0,2);
        String test1 = str1.substring(str1.length() - 2);
        String output = test.concat(test1);
        System.out.println( output);

//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        String smallest = "";
//        String largest = "";
//        String [] arrOfStr = s.split("", k);
//
//
//        while(s.length() > 3) {
//            System.out.println(s.substring(0, 3));
//            s= s.substring(4);
//        }
//        System.out.println(s);
//
//        //System.out.println(getSmallestAndLargest(s, k));



    }
//
//    public static String getSmallestAndLargest(String s, int k) {
//        String smallest = "";
//        String largest = "";
//        //s.split(k);
//        //System.out.println(s);
//
//        String [] arrOfStr = s.split("", 2);
//        return smallest + "\n" + largest;
//
//    }
}


// Complete the function
// 'smallest' must be the lexicographically smallest substring of length 'k'
// 'largest' must be the lexicographically largest substring of length 'k'
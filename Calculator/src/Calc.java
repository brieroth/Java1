public class Calc {

        public static int calculator(int a, int b, int c) {

            if (a + b == c && c-b == a) {System.out.print("Its relatable1 " + " "); }
            else if	(a + c == b && b-a == c) { System.out.print("Its relatable2 " + " ");}
            else if (b + c == a && a-c == b) { System.out.print("Its relatable3 " + " ");}


            else if (a * b == c && c/b == a) { System.out.print("Its relatable4" + " ");}
            else if	(a * c == b && b/c == a) {System.out.print("Its relatable5" + " ");}
            else if (b * c == a && a/c == b) {System.out.print("Its relatable6" + " ");}



            else  {
                System.out.println("Not relatable");
            }
            return 0;
        }



        public static void main (String [] args)
        {
            calculator(9,12,108);
        }
    }









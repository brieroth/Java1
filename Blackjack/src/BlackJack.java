public class BlackJack {

    public static void main(String[] args) {

        System.out.println(blackjack(19, 20));
    }
        //BLACKJACK*********
        public static int blackjack ( int a, int b){
            //if both values are equal to 21 return 0
            if (a == 21 && b == 21) {
                return 0;
            }

            // if a is less than or equal to 21 and b is less than 21 and a, return a
            if (a <= 21 && b < 21 && b < a) {
                return a;
            }
            if (a <= 21 && b > 21) {
                return a;
            }

            // if b is less than or equal to 21 and a is less than 21 and b, return b
            if (b <= 21 && a < 21 && a < b) {
                return b;
            }
            if (b <= 21 && a > 21) {
                return b;
            } else {
                return 0;
            }
        }


    }


public class TooHot {

    public static void main(String[] args) {
            TooHot(34, true);

    }
        public static boolean TooHot(int temperature, boolean
        isSummer){

            if(isSummer) {
                if(temperature>=60&& temperature <=90) {
                    System.out.println("Summer");
                    return true;
                }
            }
            System.out.println("Not summer");
            return false;


        }

    }


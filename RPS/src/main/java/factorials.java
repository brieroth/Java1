public class factorials {


    public static void main(String[] args) {
        int fact =1;
        int number = 5;
        fact = factorial(number);
        System.out.println(fact);
    }

public static int factorial(int n ){
        if (n==0)
            return 1;
        else{
            return(n*factorial((n-1)));
        }
}

}

import java.util.Scanner;

public class recursion
{
    static int num;
    static int numm;
    public static void main(String[] args) {
        int num;
        int numM;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        numM = input.nextInt();
        System.out.println(multiply(num,numM));
    }

    public static int multiply(int x, int y){
        if (x ==0 || y == 0) {
            return 0;
        }
        else if (y > 0) {
            return (x + multiply(x, y -1));
        }
        return -multiply(x, -y);

        }

    }



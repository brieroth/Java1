import java.util.Scanner;
import java.util.ArrayList;

public class ShapesMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for square: ");
        String input = sc.nextLine();

        //generate a new double parameter to pass with shapes
        double num = Double.parseDouble(input);

        Square sq = new Square(num);
        Rectangle rc = new Rectangle(10.0, 11.0);
        Circle cr = new Circle(5.5);

        //store shares in an array list
        ArrayList<Shape> shapes = new ArrayList();
        shapes.add(sq);
        shapes.add(rc);
        shapes.add(cr);

       System.out.println(sq.area);
       System.out.println(rc.area);
       System.out.println(cr.area);


       //check if member of instace class shape

       for(Shape s : shapes){
//        if (s instanceof  Rectangle){
//            Rectangle r = (Rectangle)s;
//            System.out.println(r);
//        }
           System.out.println(s);
       }

    }


}


import java.util.ArrayList;
import java.util.Scanner;


//// basically  this class takes everything from the main to make it neater to then furtehr call in the main.
public class ShapeHandler {
    //global shape variable
    public ArrayList<Shape> shapes = new ArrayList();

    public ShapeHandler(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter value for square: ");
        String input = sc.nextLine();

       // generate a new double parameter to pass with shapes
        double num = Double.parseDouble(input);

        Square sq = new Square(num);
        Rectangle rc = new Rectangle(10.0, 11.0);
        Circle cr = new Circle(5.5);

        //store shares in an array list
        shapes = new ArrayList<>();
        shapes.add(sq);
        shapes.add(rc);
        shapes.add(cr);
    }



}

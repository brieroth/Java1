public class Rectangle extends Shape implements Perimeter{

    private double length;
    private double width;


    public Rectangle(double width, double length){
        this.width = width;   //get variable from class level
        this.length = length;
        this.area = this.calcArea();
    }


    //instantiate method to calculate area as an overriden method



//    //overloading
//    public Rectangle(double length){
//        this.length = length;
//        this.width =  width;
//        this.area = calcArea();
//    }
    @Override
    public double calcArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2*length);
    }

// override default toString in Shape
// @Override
//    public String toString() {
//        return "width: " + width + "length: " + length;
//    }
}

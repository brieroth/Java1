public class Square extends Rectangle implements Perimeter{

    double sideLength;

    public Square(double sideLength){
        super(sideLength,sideLength); //ensures all sides are the same
        this.sideLength = sideLength;
        area = calcArea();
    }

    @Override
    public double calcArea() {
        return sideLength *sideLength;
    }

    @Override
    public double getPerimeter() {
        return 4*sideLength;
    }
}

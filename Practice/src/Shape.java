public abstract class Shape {
    //NO CONSTRUCTORS IN AN ABSTRACT CLASS; CANNOT INSTANTIATE OR CREATE OBJECTS!!!!!
    double area ;
    public abstract double calcArea();

    //default way for shape to be printed
    //overrides conversion of an object to a string eg when array prints wrong values

      @Override
    public String toString() {
        return "Area: " + area;
    }

}

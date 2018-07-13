public class Ships {
//    private int patrol;
//    private int battleships;
//    private int submarine;
//    private int destroyer;
//    private int carrier;
    private static double length;
    private double width;

    public Ships( double length, double width) {
//        this.patrol = patrol;
//        this.battleships = battleships;
//        this.submarine = submarine;
//        this.destroyer = destroyer;
//        this.carrier = carrier;
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
package shape;

public class Square implements Calculation {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * this.side;
    }

    @Override
    public double area() {
        return this.side * this.side;
    }
}

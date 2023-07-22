package shape;

public class Rectangle implements Calculation {
    private double width;
    private double lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.lenght);
    }

    @Override
    public double area() {
        return this.width * this.lenght;
    }
}

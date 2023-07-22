package shape;

public class Circle implements Calculation {
    private double ray;

    public Circle(double ray) {
        this.ray = ray;
    }

    @Override
    public double perimeter() {
        return 2 * this.ray * Math.PI;
    }

    @Override
    public double area() {
        return this.ray * this.ray * Math.PI;
    }


}

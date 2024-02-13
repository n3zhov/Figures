package mipt.figures;

public class Circle implements Figure {
    private double r = 0;

    public Circle(double r) {
        if (r > 0)
            this.r = r;
    }
    public double area() {
        return 2 * r * Math.PI;
    }
}

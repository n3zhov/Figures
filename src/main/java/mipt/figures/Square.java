package mipt.figures;

public class Square implements Figure {
    private double side = 0;
    public Square (double side) {
        if (side > 0)
            this.side = side;
    }
    public double area () {
        return side*side;
    }
}

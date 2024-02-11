package mipt.figures;

public class Rectangle implements Figure {
    private double height = 0;
    private double width = 0;

    public Rectangle(double height, double width) {
        if (height > 0)
            this.height = height;
        if (width > 0)
            this.width = width;
    }

    public double area () {
        return height * width;
    }
}

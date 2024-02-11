import mipt.figures.Circle;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void correctSquareTest() {
        Circle circle = new Circle(6.);
        double area = circle.area();

        Assertions.assertEquals(area, 2. * 6.* Math.PI);
    }

    @Test
    public void wrongConstructParametersSquareTest() {
        Circle circle = new Circle(-2);
        double area = circle.area();

        Assertions.assertEquals(area, 0.);
    }

}
import mipt.figures.Rectangle;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void correctRectangleTest() {
        Rectangle rectangle = new Rectangle(6., 5.);
        double area = rectangle.area();

        Assertions.assertEquals(area, 30.);
    }

    @Test
    public void wrongConstructParametersRectangleTest() {
        Rectangle rectangle = new Rectangle(-2, 0);
        double area = rectangle.area();

        Assertions.assertEquals(area, 0.);

        rectangle = new Rectangle(0, -2.);
        area = rectangle.area();
        Assertions.assertEquals(area, 0.);

        rectangle = new Rectangle(-2, -2.);
        area = rectangle.area();
        Assertions.assertEquals(area, 0.);
    }

}
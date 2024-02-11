import mipt.figures.Square;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SquareTest {

    @Test
    public void correctSquareTest() {
        Square square = new Square(6.);
        double area = square.area();

        Assertions.assertEquals(area, 36.);
    }

    @Test
    public void wrongConstructParametersSquareTest() {
        Square square = new Square(-2);
        double area = square.area();

        Assertions.assertEquals(area, 0.);
    }
}
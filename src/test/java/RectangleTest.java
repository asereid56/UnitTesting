import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle ;
    @Test
    @DisplayName("Calculate Area of Rectangle")
    void testCalculateArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.calculateArea());
    }

    @Test
    @DisplayName("Check is That Square or Not")
    void testIsSquare() {
        Rectangle square = new Rectangle(3, 3);
        assertTrue(square.isSquare());

        Rectangle rectangle = new Rectangle(4, 5);
        assertFalse(rectangle.isSquare());
    }
}

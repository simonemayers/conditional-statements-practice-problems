import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberComparisonTest {
    @Test
    @DisplayName("Shows that the first number is larger than the second")
    void shouldCompareFirst(){
        System.out.println("First comparison");
        assertEquals("The first number was larger than the second", NumberComparison.compare(2, 1));
    }

    @Test
    @DisplayName("Shows that the second number is larger than the first")
    void shouldCompareSecond(){
        System.out.println("Second comparison");
        assertEquals("The second number was larger than the first", NumberComparison.compare(1, 2));
    }

    @Test
    @DisplayName("Show that both numbers are the same")
    void shouldCompareEqual(){
        System.out.println("Equal comparison");
        assertEquals("Both numbers are the same", NumberComparison.compare(1, 1));
    }

}
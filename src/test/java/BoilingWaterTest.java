import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoilingWaterTest {

    @Test
    @DisplayName("Test if water is boiling")
    void shouldBoil(){
        System.out.println("Boiling");
        assertEquals("Water is boiling!", BoilingWater.message(213));
        assertNotEquals("Water is not boiling!", BoilingWater.message(213));
    }

    @Test
    @DisplayName("Test if water is not boiling")
    void shouldNotBoil(){
        System.out.println("Not boiling");
        assertNotEquals("Water is boiling!", BoilingWater.message(212));
        assertEquals("Water is not boiling!", BoilingWater.message(212));
    }

}
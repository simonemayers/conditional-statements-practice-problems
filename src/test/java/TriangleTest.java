import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.sound.midi.Track;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    @DisplayName("finding the area of triangle")
    void shouldFindArea(){
        System.out.println("Find area passed");
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
        assertEquals(60.0, triangleA.findArea());
        assertEquals(3.897, triangleB.findArea());
    }

    @Test
    @DisplayName("Should show number of sides")
    void shouldNumOfSides(){
        System.out.println("Number of sides passed");
        assertEquals(3, Triangle.numOfSides);
    }



}
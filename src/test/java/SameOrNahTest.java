import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameOrNahTest {

    @Test
    @DisplayName("Check if the words are the same")
    void shouldBeTheSame(){
        System.out.println("shouldBeTheSame");
        assertEquals("The words are the same", SameOrNah.compareWords("pizza", "pizza"));
    }

    @Test
    @DisplayName("Check is the words are different")
    void shouldBeDifferent(){
        System.out.println("shouldBeDifferent");
        assertEquals("The words are different", SameOrNah.compareWords("pie", "apple"));
    }

}
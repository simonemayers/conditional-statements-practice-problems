import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestScoresTest {
    @Test
    @DisplayName("shows grade A")
    void shouldShowA(){
        assertEquals("Your grade is an A :)", TestScores.showGrade(90));
    }
    @Test
    @DisplayName("shows grade B")
    void shouldShowB(){
        assertEquals("Your grade is a B :)", TestScores.showGrade(80));
    }
    @Test
    @DisplayName("shows grade C")
    void shouldShowC(){
        assertEquals("Your grade is a C :|", TestScores.showGrade(70));
    }
    @Test
    @DisplayName("shows grade D")
    void shouldShowD(){
        assertEquals("Your grade is a D :/", TestScores.showGrade(60));
    }
    @Test
    @DisplayName("shows grade F")
    void shouldShowF(){
        assertEquals("Your grade is an F :(", TestScores.showGrade(50));
    }
}
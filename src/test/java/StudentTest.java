import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("Should increment graduation year of student")
    void shouldIncrementGraduationYear(){
        System.out.println("shouldIncrementGraduationYear");
        Student hillary = new Student("Hillary", "Mayers", 2016, 4.0, "Political Science");
        assertEquals(2017, hillary.incrementGraduationYear());
    }

}
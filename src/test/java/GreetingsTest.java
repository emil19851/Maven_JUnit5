import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {
    @Test
    @DisplayName("The method should return \"Hello world \" ")
    void sayHello() {
        Greetings greetings = new Greetings();
        assertEquals("Hello world", greetings.sayHello());
    }

    @Test
    @DisplayName("This method should return 11")
    void numberOfCharacters() {
        Greetings greetings = new Greetings();
        assertEquals(11,greetings.countCharacters("Hello world"));

    }



}
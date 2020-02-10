import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public void testAnEmptyString() {
        assertEquals("", new StringReverser().reverse(""));
    }

    @Test
    public void testASingleLetter() {
        StringReverser reverser = new StringReverser();
        assertEquals("a", reverser.reverse("a"));
    }

    @Test
    public void testACapitalizedWord() {
        assertEquals("nemaR", new StringReverser().reverse("Ramen"));
    }

    @Test
    public void testASentenceWithPunctuation() {
        assertEquals("!yrgnuh m'I", new StringReverser().reverse("I'm hungry!"));
    }

    @Test
    public void testAPalindrome() {
        assertEquals("racecar", new StringReverser().reverse("racecar"));
    }

    @Test
    public void testAnEvenSizeWord() {
        StringReverser reverser = new StringReverser();
        assertEquals("senipucrop", reverser.reverse("porcupines"));
    }

    @Test
    public void testAnOddSizedWord() {
        StringReverser reverser = new StringReverser();
        assertEquals("suoludercni", reverser.reverse("incredulous"));
    }

    @Test
    public void voidShouldThrowException() {
        assertThrows(NullPointerException.class, () -> { new StringReverser().reverse(null); });
    }
}

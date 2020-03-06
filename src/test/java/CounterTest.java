import ie.gmit.Counter;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    private Counter myCounter;

    @BeforeEach
    void init()
    {
        myCounter = new Counter();
    }

    @Test
    void testConstructor()
    {
        assertEquals(0,myCounter.getCount());
    }

    @Test
    void testIncrement()
    {
        assertEquals( 1,myCounter.increment());
    }

    @Test
    void testDecrement()
    {
        assertEquals(-1,myCounter.decrement());
    }

//    @Test
//    void testConstructorWithValue()
//    {
//        assertThrows(IllegalArgumentException.class, ()->{new Counter(-1);});
//    }
}

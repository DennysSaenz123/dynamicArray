import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestDynamicStringList {
    // get()
    @Test
    void TestGetWithThreeElements() {
        DynamicStringList list = new DynamicStringList();
        list.add("Hello");
        list.add("World");
        list.add("!");
        assertEquals("World", list.get(1));
    }
    // set()

    // add()

    // remove()

    // size()

    // capacity()
}
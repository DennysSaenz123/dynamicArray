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
    @Test 
    void testSettingValueToIndex(){
        //Arrange
        DynamicStringList list = new DynamicStringList();
        //Act
        list.add("llll");
        list.set(0, "bbbb");   
        //Assert
        assertEquals("bbbb", list.get(0));
    }

    // add()

    // remove()

    // size()

    // capacity()
}
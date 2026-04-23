import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestDynamicStringList {
    // get()
    @Test
    void testGetWithThreeElements() {
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
    @Test
    void testAddElement() {
        //Arrange
        DynamicStringList list = new DynamicStringList();
        //Act
        list.add("A");
        list.add("B");
        list.add("C");
        int actual = list.size();

        //
        assertEquals(3,actual);
    }
    // remove()
    @Test
    void testRemoveWithThreeElements() {
        DynamicStringList list = new DynamicStringList();
        list.add("aaa");
        list.add("bbbb");
        list.add("!");
        String removed = list.remove(1);
        assertEquals("bbbb", removed);
        assertEquals(2, list.size());
    }

    // size()
    @Test
    void testGetSize() {
        //Arrange
        DynamicStringList list = new DynamicStringList();
        //Act
        list.add("A");
        list.add("B");
        list.add("C");
        int actual = list.size();

        //
        assertEquals(3,actual);
    }

    // capacity()
    @Test
    void testGetCapacity() {
        //Arrange
        DynamicStringList list = new DynamicStringList();
        //Act
        int actual = list.capacity();

        //
        assertEquals(10,actual);
    }
}
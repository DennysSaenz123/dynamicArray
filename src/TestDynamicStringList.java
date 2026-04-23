import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

class TestDynamicStringList {
    // get()

    // set()
    @Test 
    void test settingValueToIndex(){
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
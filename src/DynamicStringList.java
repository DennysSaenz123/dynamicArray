public class DynamicStringList implements StringList {
    private String[] array = new String[10];
    private int size = 0;

    /**
   * Retrieves the string at the specified index in the list.
   *
   * @param index the index of the string to retrieve.
   * @return the string at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
    public String get(int index) {
        if (index >= size || index < 0) { throw new IndexOutOfBoundsException(); }
        String value = array[index];
        return value;
    }

    /**
   * Replaces the string at the specified index with the given value.
   *
   * @param index the index of the string to replace.
   * @param value the new value to set at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
    public void set(int index, String value) {
        if (index >= size || index < 0) { throw new IndexOutOfBoundsException(); }
        array[index] = value;
    }

    /**
   * Adds a new string to the end of the list.
   *
   * @param value the string to add to the list.
   */
    public void add(String value) {
        if (size == array.length) {
            String[] newArray = new String[size*2];
            for (int i = 0; i < size; i++) { newArray[i] = array[i]; }
            array = newArray;
        }
        array[size] = value;
        size++;
    }

    public String remove(int index) {
        if (index >= size || index < 0) { throw new IndexOutOfBoundsException(); }
        for(int i = 0; i < size; i++){
            array[index] = "";
        }
        String value = "";
        return value;
        
    }

    public int size() {
        return 0;
    }

    public int capacity() {
        return 0;
    }

}
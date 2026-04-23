public class DynamicStringList implements StringList {
    // internal variables
    // array that holds data
    private String[] array = new String[10];
    // size of dynamic array
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

   /**
   * Removes the string at the specified index from the list.
   *
   * @param index the index of the string to remove.
   * @return the string that was removed.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
    public String remove(int index) {
        if (index >= size || index < 0) { throw new IndexOutOfBoundsException(); }
        String removed = array[index];
        for(int i = index; i < size; i++){ array[i] = array[i + 1]; }
        size--;
        array[size] = "";
        return removed;
    }

   /**
   * Returns the number of strings currently in the list.
   *
   * @return the size of the list.
   */
    public int size() {
        return size;
    }

    public int capacity() {
        return 0;
    }

}
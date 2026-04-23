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

    public void set(int index, String value) {
        
    }

    public void add(String value) {

    }

    public String remove(int index) {
        return null;
    }

    public int size() {
        return 0;
    }

    public int capacity() {
        return 0;
    }

}
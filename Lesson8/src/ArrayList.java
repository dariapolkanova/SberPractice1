public class ArrayList implements List {
    private Object[] arr;
    private int capacity = 10;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object item) {
        return false;
    }

    @Override
    public boolean add(Object item) {
        if (size >= capacity) {
            capacity = (capacity * 3) / 2 + 1;

            Object[] newArr = new Object[capacity];

            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }

        arr[size] = item;
        size++;

        return false;
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(int index, Object item) {

    }

    @Override
    public void set(int index, Object item) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object item) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object item) {
        return 0;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public List subList(int from, int to) {
        return null;
    }

    @Override
    public String toString() {
        return "ArrayList{" + "arr = " + Arrays.toString(arr) + ", capacity = " + capacity + ", size = " + size + "}";
    }
}

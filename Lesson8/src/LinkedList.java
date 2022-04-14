public class LinkedList implements List {
    private Node first;
    private Node last;
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
        Node node = first;

        while (node != null) {
            if (node.item.equals(item)) {
                return true;
            }

            node = node.next;
        }

        return false;
    }

    @Override
    public boolean add(Object item) {
        Node node = new Node();
        node.item = item;

        if (first == null) {
            first = node;
        } else {
            last.next = node;
            node.prev = last;
        }

        last = node;
        size++;

        return true;
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

    class Node {
        Object item;
        Node next;
        Node prev;
    }

    public String toString() {
        StringBuilder res = new StringBuilder();

        Node node = first;
        while (node != null) {
            res.append(node.item);
            node = node.next;
        }

        return res.toString();
    }
}

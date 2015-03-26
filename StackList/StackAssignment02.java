public class StackAssignment02 implements StackInterfaceAssignment02 {
    
    private int capacity = 0;

    public StackAssignment02 (int capacity) {
        this.capacity = capacity;
    }
    private class Node {
        public int data;
        public Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private int capacity = 0;
    private Node top = null;

    public void push(int element) {
        top = new Node(element, top);
    }

    public int pop() {
        int item = peek();
        top = top.next;
        return item;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }

    public int size() {
        int count = 0;
        for (Node node = top; node != null; node = node.next) {
            count++;
        }
        return count;
    }
    public int capacity() {
        return capacity;
    }
}
public class Stack {
	private int count;
	private int[] list;
	public Stack(int capacity) {
		if (capacity<=0) {
			System.out.println("The capacity should be positive!");
		} 
		else {
			list = new int[capacity];
			count = 0;
		}
	}
	public void add(int value) {
		if(count == list.length) {
			System.out.println("The stack is full");
		}
		else {
			list[count++] = value;
			count++;
		}
	}
	public void remove() {
		if(count <= 0) {
			System.out.println("The stack is empty");
		}
		else {
			list[--count] = null;
		}
	}
	public int topOfStack() {
		if(count == -1) {
			System.out.println ("The stack is empty");
		}
		else {
			return list[count-1];
		}
	}
}
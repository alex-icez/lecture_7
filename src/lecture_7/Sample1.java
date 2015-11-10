package lecture_7;

interface List<T> {
	void add(T value);
	T get(int index);
	void set(int index, T value);
	void add(int index, T value);
	void remove(int index);
	int size();
}

class LinkedList<T> implements List<T> {
	private class Item {
		T value;
		Item next;
		public Item(T value) {
			this.value = value;
		}
	}
	
	private Item head = null;
	private int size = 0;
	
	public void add(T value) {
		Item item = new Item(value);
		item.next = head;
		head = item;
		size++;
	}
	
	public T get(int index) {
		if (index < 0 || index >= size) {
			System.out.println("Index incorrect!!!");
			return null;
		}
		Item iter = head;
		for(int i = 0; i < index; i++)
			iter = iter.next;
		
		
	}
}



public class Sample1 {

	public static void main(String[] args) {

	}

}

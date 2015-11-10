package lecture_7;

interface List<T> {
	void add(T value);
	T get(int index);
	void set(int index, T value);
	void add(int index, T value);
	void insert(int index, T value);
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
		return iter.value;
	}
	
	public void set(int index, T value) {
		if (index < 0 || index >= size) {
			System.out.println("Index incorrect!!!");
			return;
		}
		Item iter = head;
		for(int i = 0; i < index; i++)
			iter = iter.next;
		iter.value = value;
	}
	
	public void remove(int index) {
		if (index < 0 || index >= size) {
			System.out.println("Index incorrect!!!");
			return;
		}
		size--;
		if (index == 0) {
			head = head.next;
			return;
		}
		Item iter = head;
		for(int i = 0; i < index - 1; i++)
			iter = iter.next;
		iter.next = iter.next.next;
	}
	
}



public class Sample1 {

	public static String max(List<Integer> l) {
		int max = l.get(0)
		
	}
	
	public static void main(String[] args) {
		List<Iteger> l = new LinkedList<>;
	}

}

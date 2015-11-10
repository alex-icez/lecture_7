package lecture_7;

interface List<T> {
	void add(T value);
	T get(int index);
	void set(int index, T value);
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
	
	@Override
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
	
	public void insert(int index, T value) {
		if (index < 0 || index > size) {
			System.out.println("Index incorrect!!!");
			return;
		}
		Item item = new Item(value);
		size++;
		if (index == 0) {
			item.next = head;
			head = item;
			return;
		}
		Item iter = head;
		for(int i = 0; i < index - 1; i++)
			iter = iter.next;
		item.next = iter.next;
		iter.next = item;
	}
	
	public int size() {
		return size;
	}

	
	
}



public class Sample1 {

	public static int max(List<Integer> l) {
		int max = l.get(0);
		for(int i = 1; i < l.size(); i++)
			if (max < l.get(i))
				max = l.get(i);
		return max;
	}
	
	public static void main(String[] args) {
		List<Iteger> l = new LinkedList<>;
	}

}

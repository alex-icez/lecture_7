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
	}
}



public class Sample1 {

	public static void main(String[] args) {

	}

}
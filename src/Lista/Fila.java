package Lista;

import java.util.LinkedList;

public class Fila<T> implements QueueTAD {

	LinkedList<T> list = new LinkedList();

	@Override
	public void enqueue(Object d) {
		list.addLast((T)d);
	}

	@Override
	public T dequeue() {
		T primeiro = (T) list.getFirst();
		list.removeFirst();
		return primeiro;
	}

	@Override
	public T first() {
		T algo = (T) list.getFirst();
		return algo;
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public int size() {

		return list.size();
	}

}

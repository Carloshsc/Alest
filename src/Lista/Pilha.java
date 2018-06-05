package Lista;

import java.util.LinkedList;

public class Pilha<T> implements StackTAD{
	
	LinkedList<T> pilha = new LinkedList();

	@Override
	public void push(Object d) {
		pilha.addLast((T)d);		
	}

	@Override
	public T pop() {
		T topo = (T) pilha.getLast();
		pilha.removeLast();
		return topo;
	}

	@Override
	public T top() {
		return pilha.getLast();
	}

	@Override
	public boolean isEmpty() {
		return pilha.isEmpty();
	}

	@Override
	public int size() {
		return pilha.size();
	}

}

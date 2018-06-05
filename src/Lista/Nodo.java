package Lista;

public interface Nodo<T> {

	public void setElement(T e);
	public T getElement() ;
	public void setNext(Nodo<T> n);
	public Nodo<T> getNext();
	

}

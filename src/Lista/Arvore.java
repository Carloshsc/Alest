package Lista;

import java.util.List;
import java.util.LinkedList;



public class Arvore<E> {
	private int count;
	private Node<E> refRoot;
	
	public enum NodePosition {
		LEFT, RIGHT
	}
	
	private class Nodo<T> {

		private T element;
		private Nodo<T> father;
		private NodePosition pos;  
		private Nodo<T> next;
		
		public Nodo(T e) {
			element = e;
			next = null;
		}
		 

		public void setElement(T e) {
			this.element = e;
		}

		public void setNext(Nodo<T> n) {
			this.next = n;
		}

		public T getElement() {
			return element;
		}

		public Nodo<T> getNextRigth() {
			if(Right)
			return next;
		}
	}
	
	
	
	public void BinaryTreeLinked(E [] vet) { 
        List <Node<E>> fila = new LinkedList<Node<E>>(); 
        int i; 
        Node<E> novo = null, primeiro = null;

        NodePosition pos = null;
        this.count = vet.length;

        if (vet.length > 0) { 
            novo = new Node<E>(vet[0]); 
            refRoot = novo;
            fila.add(0, novo); 
            pos = NodePosition.LEFT;

            for(i = 1; i < vet.length; i++) {
                     novo = new Node<E>(vet[i]); 
                     fila.add(novo);
                     primeiro = fila.get(0); 
                     novo.setFather(primeiro);

                     if (pos.equals(NodePosition.LEFT)) { 
                        primeiro.setLeft(novo); 
                        pos = NodePosition.RIGHT;
                     } 
                    else { 
                        primeiro.setRight(novo); 
                        fila.remove(0); 
                        pos = NodePosition.LEFT; 
                     } 
              } 
          } 
}
	
}

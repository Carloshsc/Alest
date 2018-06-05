package Lista;

public class ListSimpleLinked<E> implements ListTAD {

	private Nodo prim, ult;
	private int totalElementos;

	private class Nodo<T> {

		private T element;
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

		public Nodo<T> getNext() {
			return next;
		}
	}

	@Override
	public void add(Object element) {
		Nodo novo = new Nodo((E) element);
		if (ult != null) {
			ult.setNext(novo);
			totalElementos++;
		} else {
			prim = novo;
			totalElementos++;
		}
		ult = novo;
	}

	@Override
	public void add(int index, Object element) {
		if (index > totalElementos) {
			System.out.println("posição invalida");
		}

		Nodo aux1 = prim;

		int count = 0;

		while (count < index - 1 && count < this.totalElementos) {
			aux1 = aux1.getNext();
			count++;
		}

		Nodo novo = new Nodo((E) element);
		novo.setNext(aux1.getNext());
		aux1.setNext(novo);
		totalElementos++;
	}

	@Override
	public Object remove(int pos) {
		Nodo aux1 = prim;
		int count = 0;

		if (prim == null) {
			return aux1;
		}

		if (pos == 0) {
			prim = prim.getNext();
			totalElementos--;
		}

		if (pos == totalElementos - 1) {
			while (count <= pos - 2) {
				aux1 = aux1.getNext();
				count++;
			}
			ult = aux1;
			aux1.setNext(null);
			totalElementos--;
		} else {
			while (count < pos - 1) {
				aux1 = aux1.getNext();
				count++;
			}

			aux1.setNext(aux1.getNext().getNext());
			totalElementos--;
		}
		return aux1;

	}

	@Override
	public Object remove(Object element) {
		Nodo aux1 = prim;
		int count = 0;
		int pos = 0;

		if (prim == null) {
			return aux1;
		}

		while (!aux1.getNext().getElement().equals(element)) {
			aux1 = aux1.getNext();
			pos++;
		}

		if (pos == totalElementos - 1) {
			while (count <= pos - 2) {
				aux1 = aux1.getNext();
				count++;
			}
			ult = aux1;
			aux1.setNext(null);
			totalElementos--;
		} else {
			while (count < pos - 1) {
				aux1 = aux1.getNext();
				count++;
			}

			aux1.setNext(aux1.getNext().getNext());
			totalElementos--;
		}
		return aux1;
	}



	@Override
	public Object get(int pos) {
		Nodo aux = prim;
		for (int i = 0; i < totalElementos; i++) {
			if (i == pos) {
				break;
			} else {
				aux = aux.getNext();
			}
		}
		return aux.getElement();
	}



	@Override
	public void set(int index, Object element) {
        Nodo novo = new Nodo((E) element);
        Nodo aux1 = prim;
        Nodo aux2;
        int count = 0;

        if (index > totalElementos) {
            System.out.println("Posição invalida");
        }

        if (index == 0) {
            novo.setNext(prim);
            prim = novo;
            totalElementos++;
        } else {
            if (index == totalElementos - 1) {
                while (count < index) {
                    aux1 = aux1.getNext();
                    count++;
                }
                aux1.setNext(novo);
                ult = novo;
                totalElementos++;
            } else {
                if (index > 0 && index < totalElementos) {
                    while (count + 1 != index) {
                        aux1 = aux1.getNext();
                        count++;
                    }
                    aux2 = aux1.getNext();
                    aux1.setNext(novo);
                    novo.setNext(aux2);
                    totalElementos++;
                }


            }

        }
    }



	@Override
	public Object search(Object element) {

		return null;
	}

    public static void main(String args[]) {
        ListSimpleLinked list = new ListSimpleLinked<String>();
        list.add("oi");
        list.add("o");
        list.add("g");
        list.set(2, "1");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }

	@Override
	public boolean isEmpty() {
		if(totalElementos == 0) {
			return true;
		}else return false;
	}

	@Override
	public int size() {
		return totalElementos;
	}

	@Override
	public int count(Object element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clean() {
		prim = null;
		ult = null;
		totalElementos = 0;
	}

	@Override
	public void addFirst(Object element) {
		Nodo novo = new Nodo((E) element);
		Nodo aux1 = prim;
		prim = novo;
		prim.setNext(aux1);
		totalElementos++;

	}


	@Override
	public void addLast(Object element) {
		Nodo novo = new Nodo((E) element);
		Nodo aux1 = prim;
		int count = 0;


		while (count < totalElementos) {
			aux1 = aux1.getNext();
			count++;
		}

		aux1.setNext(novo);
		ult = novo;
		totalElementos++;
	}

	@Override
	public Object removeFirst() {
		prim=prim.getNext();
		totalElementos--;
		return prim;
	}

	@Override
	public Object removeLast() {
		Nodo aux1 = prim;
		int count = 0;


		while (count < totalElementos-1) {
			aux1 = aux1.getNext();
			count++;
		}
		aux1.setNext(null);
		ult = aux1;
		totalElementos--;
		return aux1;

	}


	@Override
	public Object getFirst() {
		return prim;
	}

	@Override
	public Object getLast() {

		Nodo aux1 = prim;
		int count = 0;


		while (count <= totalElementos-1) {
			aux1 = aux1.getNext();
			count++;
		}
		return aux1;
	}

}

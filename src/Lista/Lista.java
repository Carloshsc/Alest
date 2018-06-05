package Lista;

public class Lista<E> {

	private int MAX = 10;
	E[] list = ((E[]) new Object[MAX]);

	public void add(E e) {
		if (list[MAX - 1] != null) {
			int count = 0;
			MAX = MAX * 2;
			E[] list2 = ((E[]) new Object[MAX]);
			for (int i = 0; i < MAX / 2; i++) {
				list2[i] = list[i];
				count++;
			}
			list = ((E[]) new Object[MAX]);
			for (int y = 0; y < MAX / 2; y++) {
				list[y] = list2[y];
			}
			list[count + 1] = e;
		} else {

			for (int i = 0; i < MAX; i++) {
				if (list[i] == null) {
					list[i] = e;
					break;
				}
			}
		}

	}

	public void add(int index, E element) {

		E[] list2 = ((E[]) new Object[MAX]);
		for (int i = 0; i < MAX; i++) {
			if (i == index) {
				list2[i] = element;
			} else {
				list2[i] = list[i];
			}

		}

		list = ((E[]) new Object[MAX]);
		for (int y = 0; y < MAX / 2; y++) {
			list[y] = list2[y];
		}

	}

	public void clear() {
		list = ((E[]) new Object[MAX]);
	}

	public boolean contains(E e) {

		boolean tem = false;

		for (int i = 0; i < list.length; i++) {

			if (list[i].equals(e)) {

				tem = true;
			}

		}

		return tem;

	}

	public E get(int index) {
		return list[index];
	}

	public int indexOf(E e) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(e)) {
				return i;
			}
		}
		return -1;
	}

	public boolean isEmpty() {
		if (list[0] == null) {
			return true;
		} else
			return false;

	}

	public boolean remove(E e) {
		boolean remove1 = false;
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(e)) {
				list[i] = null;
				remove1 = true;

				E[] list2 = ((E[]) new Object[MAX]);
				for (int x = 0; x < MAX; x++) {
					list2[x] = list[x];
				}

				list = ((E[]) new Object[MAX]);
				for (int y = 0; y < MAX / 2; y++) {
					list[y] = list2[y];
				}

			}
		}
		return remove1;
	}

	public E remove(int index) {
		E e = null;
		for (int i = 0; i < list.length; i++) {
			if (i == index) {
				e = list[i];
				list[i] = null;

				E[] list2 = ((E[]) new Object[MAX]);
				for (int x = 0; x < MAX; x++) {
					list2[x] = list[x];
				}

				list = ((E[]) new Object[MAX]);
				for (int y = 0; y < MAX / 2; y++) {
					if (list2[y] != null) {
						list[y] = list2[y];
					}
				}

			}
		}
		return e;
	}

	public int size() {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null) {
				return i - 1;
			}
		}
		return -1;
	}

	public E set(int index, E element) {
		E e = null;
		for (int i = 0; i < list.length; i++) {
			if (i == index) {
				e = list[i];
				list[i] = element;
			}
		}

		E[] list2 = ((E[]) new Object[MAX]);
		for (int x = 0; x < MAX; x++) {
			if (x == index + 1) {
				list2[x] = e;
			} else
				list2[x] = list[x];
		}

		list = ((E[]) new Object[MAX]);
		for (int y = 0; y < MAX / 2; y++) {
			if (list2[y] != null) {
				list[y] = list2[y];
			}
		}
		return e;

	}

	public void addFirst(E element) {
		E e = null;
		for (int i = 0; i < list.length; i++) {
			if (i == 0) {
				e = list[i];
				list[i] = element;
			}
		}

		E[] list2 = ((E[]) new Object[MAX]);
		for (int x = 0; x < MAX; x++) {
			if (x == 1) {
				list2[x] = e;
			} else
				list2[x] = list[x];
		}

		list = ((E[]) new Object[MAX]);
		for (int y = 0; y < MAX / 2; y++) {
			if (list2[y] != null) {
				list[y] = list2[y];
			}
		}

	}

	public E getFirst() {
		return list[0];
	}

	public E getLast() {
		return list[MAX - 1];
	}

	public boolean removeFirst() {

		list[0] = null;
		E[] list2 = ((E[]) new Object[MAX]);
		for (int x = 0; x < MAX; x++) {
			if (list[x] != null) {
				list2[x] = list[x];
			}
		}

		list = ((E[]) new Object[MAX]);
		for (int y = 0; y < MAX / 2; y++) {
			list[y] = list2[y];
		}

		return true;
	}

	public boolean removeLast() {

		list[MAX - 1] = null;
		E[] list2 = ((E[]) new Object[MAX]);
		for (int x = 0; x < MAX; x++) {
			if (list[x] != null) {
				list2[x] = list[x];
			}
		}

		list = ((E[]) new Object[MAX]);
		for (int y = 0; y < MAX / 2; y++) {
			list[y] = list2[y];
		}

		return true;
	}

}

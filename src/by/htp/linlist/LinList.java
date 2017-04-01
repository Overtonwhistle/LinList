package by.htp.linlist;

class Node<E> {
	public E value;
	public Node<E> next;

	public Node(E e) {
		value = e;
	};
}

public class LinList<E> {
	protected Node<E> head = null;
	protected Node<E> tail = null;

	public LinList() {

	};

	public LinList(E e) {
		head = new Node<E>(e);
		tail = head;
	};

	public boolean addHead(E e) {
		if (e == null)
			return false;

		Node<E> node = new Node<E>(e);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
		return true;
	}

	public boolean addTail(E e) {
		if (e == null)
			return false;

		Node<E> node = new Node<E>(e);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		return true;
	}

	public boolean insertPos(E e, int position) {

		if ((e == null) || (position < 0))
			return false;

		Node<E> node = new Node<E>(e);

		if (position == 0) {
			addHead(e);
			return true;
		}

		Node<E> temp = head;
		for (int i = 0; i < position - 1; i++) {
			if (temp.next == null) {
				return false;
			}
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		return true;
	}

	public int size() {
		int count = 0;
		Node<E> temp = head;
		if (temp != null) {
			count++;
			while (temp.next != null) {
				count++;
				temp = temp.next;
			}
		} else {
			return 0;
		}
		return count;
	}

	public void printList() {
		if (this.size() == 0) {
			System.out.println("List is empty!");
			return;
		}

		Node<E> temp = head;
		do {
			System.out.println(temp.value);
			temp = temp.next;
		} while (temp != null);

	}

	public E find(E e) { // returns reference to value==e, null
								// if not found

		if (head == null) {
			// System.out.println("List is empty!");
			return null;
		}

		Node<E> temp = head;

		while (temp.next != null) {
			if (temp.value.equals(e)) {
				return temp.value;
			}
			temp = temp.next;
		}

		return null;
	}

	public boolean contains(E e) { // true is value exist in list
		if (head == null) {
			return false;
		}

		Node<E> temp = head;
		while (temp.next != null) {
			if (temp.value.equals(e)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public boolean remove(E e) { // returns true if Node with value==e has
									// deleted
		if (head == null) {
			System.out.println("List is empty!");
			return false;
		}

		if (head.value.equals(e)) {
			head = head.next;
			return true;
		}

		Node<E> temp = head;

		while (temp.next != null) {
			if (temp.next.value.equals(e)) {
				temp.next = temp.next.next;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

}

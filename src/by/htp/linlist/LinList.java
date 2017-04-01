package by.htp.lists.linlist;

public class LinList<E> {

	protected Node head = null;
	protected Node tail = null;

	public LinList() {
	}

	public LinList(E e) {
		head = new Node(e);
		tail = head;
	}

	public boolean addHead(E e) {
		if (e == null)
			return false;

		Node node = new Node(e);
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

		Node node = new Node(e);
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

		Node node = new Node(e);

		if (position == 0) {
			addHead(e);
			return true;
		}

		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			if (temp.next == null) {
				// System.out.println("Incorrect position!");
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
		Node temp = head;
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

	public E find(E e) { // returns reference to value==e, null
							// if not found

		if (head == null) {
			// System.out.println("List is empty!");
			return null;
		}

		Node temp = head;

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

		Node temp = head;
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

		Node temp = head;

		while (temp.next != null) {
			if (temp.next.value.equals(e)) {
				temp.next = temp.next.next;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	class Node {
		private E value;
		private Node next;

		private Node(E e) {
			value = e;
		}

		private Node() {
		}
	}

}

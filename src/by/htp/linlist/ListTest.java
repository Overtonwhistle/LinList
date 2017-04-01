package by.htp.lists.linlist;

public class ListTest {

	public static void main(String[] args) {
		
	LinList<String> list = new LinList<String>("first");
	list.addHead("to Head 1");
	list.addHead("3");
	list.addHead("4");
	list.addHead("5");
	
//	System.out.println("head:" +list.head.value);
//	System.out.println("head:" +list.head.value);
//	System.out.println("tail:" +list.tail.value);
//	System.out.println("tail:" +list.tail.value);
	
	
	System.out.println("size="+list.size());
	
		
	list.addTail("6");	
	System.out.println("tail:" +list.tail.value);
	
	System.out.println("size="+list.size());
//	list.addHead(new Integer ("121")*2);
//	list.printList();

	LinList<Integer> listInt = new LinList<Integer>();
	
	listInt.addTail(1);
	listInt.addTail(2);
	listInt.addTail(3);
	listInt.addTail(4);
	listInt.addTail(5);
	listInt.addTail(6);
	
	System.out.println("size="+listInt.size());
	listInt.printList();
	System.out.println("inserting");
	System.out.println(listInt.insertPos(100, 3));
//	listInt.addHead(100);
	listInt.printList();
	
	LinList<Integer> listInt2 = new LinList<Integer>();
	listInt2.addHead(listInt.find(100));
//	System.out.println("list2");
//	listInt2.printList();
//	System.out.println(listInt2.contains(100));
//	System.out.println(listInt.size());
//	System.out.println(listInt.contains(1));
	
	System.out.println(listInt.remove(100));
	listInt.printList();
	
	listInt2.addHead(1);
	listInt2.addHead(2);
	
	System.out.println(listInt2.remove(0));
	listInt2.printList();
	}
	
		public <E> void printList(LinList<E> list) {
	if (list.size() == 0) {
		System.out.println("List is empty!");
		return;
	}

	list.Node temp = list.head;
	do {
		System.out.println(temp.value);
		temp = temp.next;
	} while (temp != null);

}
	
}
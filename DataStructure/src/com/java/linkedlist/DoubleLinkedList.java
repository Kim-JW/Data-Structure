package com.java.linkedlist;

class Node {
	private String data;
	private Node next;
	private Node prev;

public Node(String data) {
	this.data = data;
	this.next = null;
	this.prev = null;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public Node getNext() {
	return next;
}

public void setNext(Node next) {
	this.next = next;
}

public Node getPrev() {
	return prev;
}

public void setPrev(Node prev) {
	this.prev = prev;
}


}

public class DoubleLinkedList {

private Node head;
private Node tail;
private int size;

public DoubleLinkedList() {
	head = null;
}

public void addFirst(String data) {
	Node newNode = new Node(data);

	newNode.setNext(head);

	if(head != null) {
		head.setPrev(newNode);
	}
	head = newNode;
	size++;

	if(head.getNext() == null) {
		tail = head;
	}
}

public void addLast(String data) {
	Node newNode = new Node(data);

	if(size == 0) {
		addFirst(data);
	} else {
		tail.setNext(newNode);
		newNode.setPrev(tail);
		tail = newNode;
		size++;
	}
}

public void add(int idx, String data) {
	if(idx ==0) {
		addFirst(data);
	} else {
		Node temp1 = node(idx-1);
		Node temp2 = temp1.getNext();

		Node newNode = new Node(data);

		temp1.setNext(newNode);
		newNode.setNext(temp2);

		if(temp2 != null) {
			temp2.setPrev(newNode);
		}

		newNode.setPrev(temp1);
		size++;

		if(newNode.getNext() == null) {
			tail = newNode;
		}
	}
}

public String removeFirst() {
	Node temp = head;
	head = temp.getNext();

	String returnData = temp.getData();
	temp = null;

	if(head != null) {
		head.setPrev(null);
	}
	size--;
	return returnData;
}

public String remove(int idx) {
	if(idx == 0) {
		return removeFirst();
	}

	Node temp = node(idx-1);

	Node todoDeleted = temp.getNext();

	temp.setNext(temp.getNext().getNext());

	if(temp.getNext() != null) {
		temp.getNext().setPrev(temp);
	}

	String returnData = todoDeleted.getData();

	if(todoDeleted == tail) {
		tail = temp;
	}

	todoDeleted = null;
	size--;
	return returnData;
}

public String removeLast() {
	return remove(size-1);
}

public int indexOf(String data) {
	Node temp = head;

	int idx = 0;

	while(temp.getData() != data) {
		temp = temp.getNext();
		idx++;

		if(temp == null) {
			return -1;
		}
	}

	return idx;
}

private Node node(int idx) {
	if(idx < size / 2) {
		Node x = head;
		for(int i=0; i< idx; i++) {
			x = x.getNext();
		}
		return x;
	} else {
		Node x = tail;
		for(int i= size -1; i> idx; i--) {
			x = x.getPrev();
		}

		return x;
	}
}

public void printAll() {
	for(int i=0; i< size; i++) {
		System.out.print(get(i) + " ");
	}
	System.out.println();
}

public String get(int idx) {
	return node(idx).getData();
}

public static void main(String[] args) {
	DoubleLinkedList list = new DoubleLinkedList();
	list.addFirst("kim");
	list.addFirst("JJ");
	list.printAll();

	list.addFirst("cc");
	list.printAll();

	list.addLast("Joo");

	list.printAll();

	list.removeFirst();
	list.printAll();

	list.removeLast();
	list.printAll();

	}

}

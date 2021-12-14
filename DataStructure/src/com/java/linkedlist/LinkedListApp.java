package com.java.linkedlist;

class LinkedList<T> {
	public Node head;
	
	
	class Node {
		private T data;
		public Node link;
		
		public Node() {
			this.data = null;
			this.link = null;
		}
		
		public Node(T data) {
			this.data = data;
			this.link = null;
		}
		
		public Node(T data, Node link) {
			this.data = data;
			this.link = link;
		}
		
		public T getData() {
			return this.data;
		}
	}
	
	public LinkedList() {
		head = null;
	}
	
	public void insertNode(Node preNode, T data) {
		Node newNode = new Node(data);
		
		newNode.link = preNode.link;
		preNode.link = newNode;
	}
	
	public void inserNode(T data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			this.head = newNode;
		} else {
			Node tempNode = head;
			
			while(tempNode.link != null) {
				tempNode = tempNode.link;
			}
			tempNode.link = newNode;
		}
	}
	
	public void deleteNode(T data) {
		Node preNode = head;
		Node tempNode = head.link;
		
		if(data.equals(preNode.getData())) {
			head = preNode.link;
			preNode.link = null;
		} else {
			while(tempNode != null) {
				if(data.equals(tempNode.getData())) {
					if(tempNode.link == null) {
						preNode.link = null;
					} else {
						preNode.link = tempNode.link;
						tempNode.link = null;
					}
					break;
				} else {
					preNode = tempNode;
					tempNode = tempNode.link;
				}
			}
		}
	}
	
	public void deleteNode() {
		Node preNode;
		Node tempNode;
		
		if(head == null) {
			return;
		} else {
			preNode = head;
			tempNode = preNode.link;
			
			while(tempNode.link != null) {
				preNode = tempNode;
				tempNode = tempNode.link;
			}
			
			preNode.link = null;
		}
	}
	
	public Node searchNode(T data) {
		Node tempNode = this.head;
		
		while(tempNode != null) {
			if(data.equals(tempNode.getData())) {
				return tempNode;
			} else {
				tempNode = tempNode.link;
			}
		}
		
		return tempNode;
	}
	
	public void printAll() {
		Node tempNode = this.head;
		
		while(tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			tempNode = tempNode.link;
		}
		System.out.println();
	}
}

public class LinkedListApp {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.inserNode(10);
		list.inserNode(20);
		list.inserNode(30);
		list.deleteNode();
		
		list.printAll();
		
		System.out.println(list.searchNode(40));
		list.searchNode(20);
	}

}

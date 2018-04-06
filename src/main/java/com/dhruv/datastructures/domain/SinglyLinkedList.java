package com.dhruv.datastructures.domain;

public class SinglyLinkedList<T> {

	private SinglyLinkedListNode<T> head;
	private SinglyLinkedListNode<T> tail;
	private int size;
	
	public SinglyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public SinglyLinkedList(SinglyLinkedListNode<T> head, SinglyLinkedListNode<T> tail, int size) {
		super();
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

	public void push(T element) {
		
		SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(element);
		newNode.setNext(this.head);
		if(this.head==null) {
			this.tail = newNode;
		}
		this.head = newNode;
	}
}

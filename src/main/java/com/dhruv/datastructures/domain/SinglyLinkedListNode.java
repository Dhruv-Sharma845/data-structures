package com.dhruv.datastructures.domain;

public class SinglyLinkedListNode<T> {

	private T data;
	private SinglyLinkedListNode<T> next;
	
	public SinglyLinkedListNode() {
		super();
	}

	SinglyLinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public SinglyLinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(SinglyLinkedListNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "SinglyLinkedListNode [data=" + data + ", next=" + next + "]";
	}
	
}

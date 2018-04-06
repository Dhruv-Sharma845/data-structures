package com.dhruv.datastructures.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.dhruv.datastructures.service.SinglyLinkedListService;
import com.dhruv.datastructures.utility.SinglyLinkedListUtil;

public class SinglyLinkedListServiceImpl implements SinglyLinkedListService {
	
	@Autowired
	private SinglyLinkedListUtil singlyLinkedListUtil;
	
	public void pushElement(Integer element) {
		singlyLinkedListUtil.push(element);
	}
}

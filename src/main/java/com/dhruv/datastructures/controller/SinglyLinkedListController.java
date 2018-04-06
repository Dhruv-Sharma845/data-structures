package com.dhruv.datastructures.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhruv.datastructures.service.SinglyLinkedListService;

@RestController("/singly-linked-list")
public class SinglyLinkedListController {
	
	@Autowired
	SinglyLinkedListService singlyLinkedListService;
	
	@RequestMapping("/pushElement/{element}")
	public void pushElement(@PathVariable("element") Integer element) {
		singlyLinkedListService.pushElement(element);
	}
}

package com.websystique.springmvc.service;

import org.springframework.stereotype.Service;
@Service("testService")
public class MyService {
	
	private int a= 1;
	public int addition(int a1, int b) {
		a+=1;
		return a;
	}
}

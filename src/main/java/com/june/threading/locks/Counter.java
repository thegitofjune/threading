package com.june.threading.locks;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
	
	private int count;
	private ReentrantLock reentrantLock = new ReentrantLock();
	
	public ReentrantLock getReentrantLock() {
		return reentrantLock;
	}
	
	public void increment() {
		count ++;
	}
	
	public void decrement() {
		count --;
	}
	
	public int getCount() {
		return count;
	}
	


}

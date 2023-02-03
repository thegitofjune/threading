package com.june.threading.readWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Counter {

	private int count;
	private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

	public ReentrantReadWriteLock getReentrantReadWriteLock() {
		return reentrantReadWriteLock;
	}

	public void increment() {
		count++;
	}

	public void decrement() {
		count--;
	}

	public int getCount() {
		return count;
	}

}

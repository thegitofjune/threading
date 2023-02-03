package com.june.threading.sleepJoinInterrupt;

public class JoinThread {

	private int count;

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

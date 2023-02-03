package com.june.threading.extendThreadExample;

public class ExtendThreadClass extends Thread {
	
	public void run() {
		System.out.println("Starting thread " + getName() + " the thread class, "
				+ "not the preferred method as jave doesn't have multiple inheritance "
				);
	}

}

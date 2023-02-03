package com.june.threading.extendThreadExample;

public class Main {

	public static void main(String[] args) {
		
	

	Thread thread1 = new ExtendThreadClass();
	Thread thread2 = new ExtendThreadClass();
	
	thread1.setName("thread1");
	
	System.out.println("starting main method");
	
	thread1.start();
	thread2.start();
	
	System.out.println("finishing main method");
	
	}
}

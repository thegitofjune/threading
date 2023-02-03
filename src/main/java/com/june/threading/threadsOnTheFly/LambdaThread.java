package com.june.threading.threadsOnTheFly;

public class LambdaThread {

	
	public static void main(String[] args) {
		
		
		Thread thread1 = new Thread(() -> {
			System.out.println("code in here is the same as code in the run method");
		});
		
		thread1.start();
		
	}
}

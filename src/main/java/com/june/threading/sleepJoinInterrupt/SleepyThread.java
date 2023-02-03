package com.june.threading.sleepJoinInterrupt;

public class SleepyThread {

	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			System.out.println("This thread will sleep, the sleep method is called in the try block");
		});

		
		thread1.start();
		try {
			System.out.println("thread is tired");
			Thread.sleep(10000);
			System.out.println("thread had a nap, awake again now");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

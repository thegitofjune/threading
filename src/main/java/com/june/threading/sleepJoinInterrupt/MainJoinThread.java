package com.june.threading.sleepJoinInterrupt;


public class MainJoinThread {

	public static void main(String[] args) {

		Counter counter = new Counter();

		Thread thread1 = new Thread(() -> {
			for (int count = 1; count <= 1000000; count++) {
				counter.increment();
			}
		});

		thread1.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		System.out.println(counter.getCount());

	}

}

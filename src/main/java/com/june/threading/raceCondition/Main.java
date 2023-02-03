package com.june.threading.raceCondition;

public class Main {

	public static void main(String[] args) {

		Counter counter = new Counter();

		Thread thread1 = new Thread(() -> {
			for (int count = 1; count <= 1000000; count++) {
				counter.incrementCount1();
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int count = 1; count <= 1000000; count++) {
				counter.decrementCount1();
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(counter.getCount1());
		System.out.println(counter.getCount2());

	}
}

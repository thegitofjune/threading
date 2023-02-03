package com.june.threading.locks;

public class Main {

	public static void main(String[] args) {

		Counter counter = new Counter();

		Thread thread1 = new Thread(() -> {
			counter.getReentrantLock().lock(); // get the lock
			System.out.println("thread 1 has the lock");
			try {
				counter.increment();
				try {
					Thread.sleep(1000); // pause before releasing lock
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} finally {
				counter.getReentrantLock().unlock(); // release the lock
				System.out.println("thread 1 has released the lock");
			}
		});

		Thread thread2 = new Thread(() -> {
			while (true) {

				if (counter.getReentrantLock().tryLock()) { // try to get the lock
					System.out.println("thread 2 has the lock");
					try {
						System.out.println("thread 2 printing the count: " + counter.getCount());
					} finally {
						counter.getReentrantLock().unlock(); // release the lock
						System.out.println("thread 2 has released the lock");
					}
					break;
				} else {
					System.out.println("Thread 2 performing other tasks while waiting for the lock");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		});

		thread1.start();
		thread2.start();

	}

}

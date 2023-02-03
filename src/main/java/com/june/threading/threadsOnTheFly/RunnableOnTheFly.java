package com.june.threading.threadsOnTheFly;

public class RunnableOnTheFly {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("A more verbose on the fly thread than the lambda");
			}
		});

		thread1.start();
	}

}

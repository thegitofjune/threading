package com.june.threading.sleepJoinInterrupt;

public class InterrputThread {

	public static void main(String[] args) {
		Thread backgroundProcess = new Thread(() -> {
			while (true) {
				try {
					System.out.println("running background process, if not interrupted, it will never terminate");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					break;
				}
			}

		});

		Thread foregroundProcess = new Thread(() -> {
			System.out.println("running foreground process");
		});

		backgroundProcess.start();
		foregroundProcess.start();

		try {
			foregroundProcess.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		backgroundProcess.interrupt();
	}
}

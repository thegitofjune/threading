package com.june.threading.implementRunnableExample;

public class Main {
	
	public static void main(String[] args) {
		
		RunnableThread runnable1 = new RunnableThread();
		RunnableThread runnable2 = new RunnableThread();
		
		Thread thread1 = new Thread(runnable1);
		thread1.setName("thread1");
		Thread thread2 = new Thread(runnable2);
		thread2.setName("thread2");
		thread1.start();
		thread2.start();
		
		
	}

}

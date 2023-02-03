package com.june.threading.implementRunnableExample;

public class RunnableThread implements Runnable {

	public void run() {
		System.out.println("running thread preferred to extending thread as allows for multiple inheritance");
	}

}

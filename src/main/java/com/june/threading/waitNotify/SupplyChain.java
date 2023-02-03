package com.june.threading.waitNotify;

import java.util.LinkedList;
import java.util.Queue;

public class SupplyChain {

	private Queue<ElectronicDevice> queue = new LinkedList<>();

	public synchronized void addItemToQueue(ElectronicDevice workItem) {
		if (queue.size() >= 10) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		queue.add(workItem);
	}

	public synchronized ElectronicDevice getItemFromQueue() {
		ElectronicDevice electronicDevice = queue.poll();
		if (queue.size() < 10) {
			notify();
		}
		return electronicDevice;
	}

	public int getQueueSize() {
		return queue.size();
	}

}
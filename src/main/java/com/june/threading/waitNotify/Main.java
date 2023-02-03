package com.june.threading.waitNotify;

public class Main {

	public static void main(String[] args) {

		SupplyChain supplyChain = new SupplyChain();

		Thread gadgetFactory = new Thread(() -> {
			int count = 1;
			while (true) {
				System.out.println("queue size is " + supplyChain.getQueueSize());
				supplyChain.addItemToQueue(new ElectronicDevice(count));
				System.out.println("gadgetFactory: item " + count + " added");
				count++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread buyerOfGadgets = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ElectronicDevice electronicDevice = supplyChain.getItemFromQueue();
				System.out.println("consumer: processing item " + electronicDevice.getId());
			}
		});

		gadgetFactory.start();
		buyerOfGadgets.start();
	}

}

package com.factory;

/**
 * Author: Aadarsh Patil
 * Entry point for the multi-stage manufacturing simulation.
 */
public class Main {
	public static void main(String[] args) throws InterruptedException {
		MultiStageProcessor processor = new MultiStageProcessor(3);

		processor.addItem(new Item(1, 0, 1, "Item 1"));
		processor.addItem(new Item(2, 0, 2, "Item 2"));
		processor.addItem(new Item(3, 0, 3, "Item 3"));

		processor.startProcessing();

		// Let the simulation run for a while
		Thread.sleep(5000);

		processor.shutdown();
	}
}

package com.factory;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Author: Aadarsh Patil 
 * Manages items at a particular stage using a BlockingDeque.
 */
public class BlockingStageQueue {
	private final BlockingDeque<Item> queue;

	/**
	 * Constructs a BlockingStageQueue.
	 */
	public BlockingStageQueue() {
		this.queue = new LinkedBlockingDeque<>();
	}

	/**
	 * Adds an item to the queue.
	 * 
	 * @param item Item to be added
	 * @throws InterruptedException if interrupted while waiting to add
	 */
	public void addItem(Item item) throws InterruptedException {
		queue.put(item);
	}

	/**
	 * Retrieves and removes the item at the front of the queue.
	 * 
	 * @return Item at the front of the queue
	 * @throws InterruptedException if interrupted while waiting to retrieve
	 */
	public Item pollItem() throws InterruptedException {
		return queue.take();
	}

	/**
	 * Checks if the queue is empty.
	 * 
	 * @return True if the queue is empty, otherwise false
	 */
	public boolean isEmpty() {
		return queue.isEmpty();
	}
}

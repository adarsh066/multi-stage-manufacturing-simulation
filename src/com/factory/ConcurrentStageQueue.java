package com.factory;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Author: Aadarsh Patil
 * Manages items at a particular stage using a ConcurrentLinkedDeque.
 */
public class ConcurrentStageQueue {
	private final ConcurrentLinkedDeque<Item> queue;

	/**
	 * Constructs a ConcurrentStageQueue.
	 */
	public ConcurrentStageQueue() {
		this.queue = new ConcurrentLinkedDeque<>();
	}

	/**
	 * Adds an item to the queue.
	 * 
	 * @param item Item to be added
	 */
	public void addItem(Item item) {
		queue.add(item);
	}

	/**
	 * Retrieves and removes the item at the front of the queue.
	 * 
	 * @return Item at the front of the queue
	 */
	public Item pollItem() {
		return queue.poll();
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

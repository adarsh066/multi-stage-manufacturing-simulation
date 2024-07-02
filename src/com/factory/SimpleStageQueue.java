package com.factory;

import java.util.ArrayDeque;

/**
 * Author: Aadarsh Patil
 * Manages items at a particular stage using an ArrayDeque.
 */
public class SimpleStageQueue {
	private final ArrayDeque<Item> queue;

	/**
	 * Constructs a SimpleStageQueue.
	 */
	public SimpleStageQueue() {
		this.queue = new ArrayDeque<>();
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

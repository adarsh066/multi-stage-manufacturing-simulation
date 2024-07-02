package com.factory;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author: Aadarsh Patil 
 * Manages items at a particular stage using a Deque.
 */
public class StageQueue {
	private final Deque<Item> queue;

	/**
	 * Constructs a StageQueue.
	 */
	public StageQueue() {
		this.queue = new LinkedList<>();
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

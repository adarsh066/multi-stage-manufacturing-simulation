package com.factory;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


/**
 * Author: Aadarsh Patil
 * Simulates a multi-stage manufacturing process.
 */
public class MultiStageProcessor {
	private final BlockingStageQueue[] stages;
	private final ExecutorService executor;

	/**
	 * Constructs a MultiStageProcessor with the specified number of stages.
	 * 
	 * @param stageCount Number of stages
	 */
	public MultiStageProcessor(int stageCount) {
		stages = new BlockingStageQueue[stageCount];
		for (int i = 0; i < stageCount; i++) {
			stages[i] = new BlockingStageQueue();
		}
		executor = Executors.newFixedThreadPool(stageCount);
	}

	/**
	 * Adds an item to the first stage.
	 * 
	 * @param item Item to be added
	 * @throws InterruptedException if interrupted while waiting to add
	 */
	public void addItem(Item item) throws InterruptedException {
		stages[0].addItem(item);
	}

	/**
	 * Starts the processing of items through the stages.
	 */
	public void startProcessing() {
		for (int i = 0; i < stages.length; i++) {
			final int stageIndex = i;
			executor.submit(() -> processStage(stageIndex));
		}
	}

	/**
	 * Processes items at a specific stage and moves them to the next stage.
	 * 
	 * @param stageIndex Index of the stage to process
	 */
	private void processStage(int stageIndex) {
		try {
			while (true) {
				Item item = stages[stageIndex].pollItem();
				System.out.println("Processing item " + item.getItemId() + " at stage " + stageIndex);
				if (stageIndex < stages.length - 1) {
					item.setStage(stageIndex + 1);
					stages[stageIndex + 1].addItem(item);
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	/**
	 * Shuts down the processor.
	 */
	public void shutdown() {
		executor.shutdownNow();
	}
}

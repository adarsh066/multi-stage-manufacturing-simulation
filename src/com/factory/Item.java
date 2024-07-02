
package com.factory;

/**
 * Author: Aadarsh Patil
 * Represents an item in the manufacturing process.
 */
public class Item {
    private final int itemId;
    private int stage;
    private final int priority;
    private final String description;

    /**
     * Constructs an Item with the specified properties.
     * 
     * @param itemId Unique identifier for the item
     * @param stage Current stage of the item
     * @param priority Priority of the item
     * @param description Description of the item
     */
    public Item(int itemId, int stage, int priority, String description) {
        this.itemId = itemId;
        this.stage = stage;
        this.priority = priority;
        this.description = description;
    }

    public int getItemId() {
        return itemId;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}

Author : AADARSH PATIL

# Multi-Stage Manufacturing Simulation

A Java simulation of a multi-stage manufacturing process using various Deque implementations to handle concurrent, blocking, and single-threaded operations. Includes priority-based processing and thread safety for efficient throughput.

## Project Structure
MultiStageManufacturing
└── src
└── main
└── java
└── com
└── factory
├── Item.java
├── StageQueue.java
├── BlockingStageQueue.java
├── ConcurrentStageQueue.java
├── SimpleStageQueue.java
├── MultiStageProcessor.java
└── Main.java

## Classes Overview

### Item.java
Represents an item in the manufacturing process.

### StageQueue.java
Manages items at a particular stage using the `Deque` interface.

### BlockingStageQueue.java
Manages items at a particular stage using the `BlockingDeque` interface.

### ConcurrentStageQueue.java
Manages items at a particular stage using the `ConcurrentLinkedDeque` class.

### SimpleStageQueue.java
Manages items at a particular stage using the `ArrayDeque` class.

### MultiStageProcessor.java
Simulates a multi-stage manufacturing process with concurrent processing and priority handling.

### Main.java
Entry point for the multi-stage manufacturing simulation.

## Usage

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/multi-stage-manufacturing-simulation.git
    ```

2. Navigate to the project directory:
    ```sh
    cd multi-stage-manufacturing-simulation
    ```

3. Build and run the project using your preferred Java IDE or the command line.

## Example
Here is a basic example of running the simulation:

```java
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

This will add three items to the manufacturing process and simulate their movement through the stages.


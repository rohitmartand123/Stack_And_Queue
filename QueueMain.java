package com.bridgelabz.stackandqueue;

/*
 * @author Rohit
 * Ability to create Queue
 */
public class QueueMain {
	public static void main(String[] args) {
		System.out.println("------- Welcome to Stacks and Queues Program ---------");
		System.out.println();

		QueueImplementation queueImplementation = new QueueImplementation();

		// Calling operation menu method of QueueImplementation
		queueImplementation.operationsMenu();
	}
}
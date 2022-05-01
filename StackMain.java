package com.bridgelabz.stackandqueue;
import java.util.Scanner;
/*
 * @author Rohit
 * Ability to peak and pop from the Stack till it is empty
 */
public class StackMain {
	public static void main(String[] args) {
		System.out.println("------- Welcome to Stacks and Queues Program ---------");
		System.out.println();

		StackImplementation stackImplementation = new StackImplementation();

		// Calling operation menu method of StackImplementation
		stackImplementation.operationsMenu();
	 	}
}

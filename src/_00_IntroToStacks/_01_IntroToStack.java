package _00_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> stack = new Stack<Double>();

		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			stack.push(Math.random() * 100 + Math.random());
		}

		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String input1 = JOptionPane.showInputDialog("Enter a value in between 0 and 100, including the two numbers");
		String input2 = JOptionPane
				.showInputDialog("Enter another value in between 0 and 100, including the two numbers");
		double i1 = Double.parseDouble(input1);
		double i2 = Double.parseDouble(input2);
		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.
		Double temp;
		for (int i = 0; i < stack.size(); i++) {
			temp = stack.pop();
			if (i1 < i2) {
				if (temp > i1 && temp < i2) {

				}
			} else {

			}
		}
		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}

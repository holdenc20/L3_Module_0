package IntroToStacks;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> s=new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random r = new Random();
		for(int i=0;i<100;i++) {
			s.push((double)(r.nextInt(10000))/100);
			
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter something 0-100");
		double x=sca.nextDouble();
		System.out.println("Enter something 0-100");
		double y=sca.nextDouble();
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		if(x-y>0) {
		}
		else {
			double d=x;
			x=y;
			y=d;
		}
		for(int m=0;m<s.size();m++) {
			double p=s.pop();
			if(x>p&&y<p) {
				System.out.println(p);
			}
		}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}

package com.simplilearn.asg1.calc;

public class Utility {

	public static void main(String[] args) {
		
		int i = 0;
		int arr[] = new int[args.length];
		for (String s: args) {
		
		try {
            // Parse the string argument into an integer value.
            arr[i] = Integer.parseInt(s);
        }
        catch (NumberFormatException nfe) {
            // The first argument isn't a valid integer.  Print
            // an error message, then exit with an error code.
            System.out.println("The first argument must be an integer.");
            System.exit(1);
        }
		
		
          //  System.out.println(s);
            i++;
        }
		Calculator c = new Calculator();
		System.out.printf("add :%d\n", c.add(arr[0], arr[1]));
		System.out.printf("subtract :%d\n", c.subtract(arr[0], arr[1]));
		System.out.printf("multiply : %d\n", c.multiply(arr[0], arr[1]));
		System.out.printf("divide %f\n", c.divide(arr[0], arr[1]));
		System.out.printf("percentage : %f\n", c.percentage(arr[0]));

	}

}

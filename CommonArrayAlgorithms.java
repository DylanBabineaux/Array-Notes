import java.util.*;
public class CommonArrayAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// Filling
		double[] values = new double[10];
		for(int i = 0; i < values.length; i++) {
			values[i] = i + 1;
		}
		
		// Sum and Average Value
		double total = 0;
		for(double element: values) {
			total = total + element;
		}
		double average = 0;
		if(values.length > 0) {
			average = total / values.length;
		}
		
		// Maximum
		double largest = values[0];
		for (int i = 1; i < values.length; i++) {
			if (values[i] > largest) {
				largest = values[i];
			}
		}
		
		// Minimum
		double smallest  = values[0];
		for (int i = 1; i < values.length; i++) {
			if (values[i] < smallest) {
				smallest = values[i];
			}
		} 
		
		// Element Separators - Customizable
		for(int i = 0; i < values.length; i ++) {
			if (i > 0) {
				System.out.print(" | ");
			}
			System.out.print(values[i]);
		}
		
		// Element Separators - Commas
		Arrays.toString(values);
		
		// Linear Search
		int searchedValue = 6;
		boolean found = false;
		int pos = 0;
		while (pos < values.length) {
			if(values[pos] == searchedValue) {
				found = true;
				break;
			}
			pos++;
		}
		
		// Swapping Elements
		double temp = values[1];
		values[1] = values[2];
		values[2] = temp;
		
		// Copying Arrays
		double[] newValues = Arrays.copyOf(values, values.length);
		// Expanding Arrays
		double[] newValues1 = Arrays.copyOf(values, 2 * values.length);
		values = newValues1;
		
		// Reading Input
		int currentSize = 0;
		double inputs[] = new double[10];
		while (in.hasNextDouble() && currentSize < inputs.length) {
			inputs[currentSize] = in.nextDouble();
			currentSize++;
		}
	}

}

import java.util.Arrays;

import javax.swing.*;
public class InitArrayAndSort {

	public static void main(String[] args) {

		String x1= JOptionPane.showInputDialog("First element ?");
		String x2= JOptionPane.showInputDialog("Second element ?");
		String x3= JOptionPane.showInputDialog("Third element ?");  
		
		boolean isDouble = false;
		
		//check if any of entered elements is double
		if( x1.length() > 1 || x2.length() > 1 || x3.length() > 1 )
			isDouble = true;
		
		// converting strings to doubles OR chars depend on isDouble variable
		if (isDouble) {
			double d1 = Double.parseDouble(x1); 
			double d2 = Double.parseDouble(x2); 
			double d3 = Double.parseDouble(x3); 			
			double[] list = new double [3];
			list[0] = d1;
			list[1] = d2;
			list[2] = d3;
			double[] array1 = {d1,d2,d3};
			double[] array2; 
			
			System.out.println(Arrays.toString(list));
			Arrays.sort(list);
			double[] sortedList = displaySortedNumbers (list);
			System.out.println(Arrays.toString(sortedList));
			
			}
			else {
				
			char[] list = new char [3];
			//double[] sortedList = displaySortedNumbers (sortedList);
			
			char c1 = x1.charAt(0);
			char c2 = x2.charAt(0);
			char c3 = x3.charAt(0);
			list[0] = c1;
			list[1] = c2;
			list[2] = c3;
			char[] array1 = {c1,c2,c3};
			char[] array2; 

			System.out.println(Arrays.toString(list));
			Arrays.sort(list);
			//System.out.println(Arrays.toString(sortedList));
			}}


	private static double[] displaySortedNumbers(double[] list) {
		java.util.Arrays.sort(list);
		
		return list;
	}
	private static char[] displaySortedNumbers(final char[] list) {
		java.util.Arrays.sort(list);
		
		return list;
	}
}

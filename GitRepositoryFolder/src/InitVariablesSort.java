import javax.swing.*;

public class InitVariablesSort {

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
			displaySortedNumbers(d1,d2,d3);
		} 
		else {
			char c1 = x1.charAt(0);
			char c2 = x2.charAt(0);
			char c3 = x3.charAt(0);
			displaySortedNumbers(c1,c2,c3);
		}	
		
	} // end of main
	
	
	// method displaySortedNumbers for doubles
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		String str0 = "before: " + num1 + "   " + num2 + "   " + num3;
		String str= "";
		double x = 0.0;			
		
		// implementing bubble sorting method
		if (num1 >= num2) {
			x = num1;
			num1 = num2;
			num2 = x;
		}
		
		if (num1 >= num3) {
			x = num1;
			num1 = num3;
			num3 = x;
		}
		
		if (num2 >= num3) {
			x = num2;
			num2 = num3;
			num3 = x;
		}		
		
		str = "after:     " + num1 + "   " + num2 + "   " + num3;			
		JOptionPane.showMessageDialog(null,str0 + "\n" + str);		
	} // end of displaySortedNumbers (doubles)
	
	// method displaySortedNumbers for chars
	public static void displaySortedNumbers(char num1, char num2, char num3) {
		String str0 = "before: " + num1 + "   " + num2 + "   " + num3;
		String str= "";
		char x = 'a';
		
		// implementing bubble sorting method
		if (num1 >= num2) {
			x = num1;
			num1 = num2;
			num2 = x;
		}
		
		if (num1 >= num3) {
			x = num1;
			num1 = num3;
			num3 = x;
		}
		
		if (num2 >= num3) {
			x = num2;
			num2 = num3;
			num3 = x;
		}
		
		str = "after:     " + num1 + "   " + num2 + "   " + num3;		
		JOptionPane.showMessageDialog(null,str0 + "\n" + str);		
	} // end of displaySortedNumbers (chars)
	
} // end of class
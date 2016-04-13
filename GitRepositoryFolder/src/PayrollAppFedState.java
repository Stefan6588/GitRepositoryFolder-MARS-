

import java.util.Scanner;
//import javax.swing.JOptionPane;

public class PayrollAppFedState {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String Name;
		int Hours=0;
		double Payrate= 8.5, Fedtax= .20, Statetax= .09;
		double Grosspay= 0, Deductions= 0;
		double Netpay = 0;
		
		System.out.println("Enter Name: ");
		Name= input.next();
		System.out.println("Enter Hours Worked");
		Hours= input.nextInt();
		
		Grosspay = Hours * Payrate;

		//Augmented Assignment operators (2.13, table 2.4)
		//Fedtax= Grosspay * Fedtax;
		Fedtax *= Grosspay;
		//Statetax= Grosspay * Statetax;
		Statetax *= Grosspay;
		
		Deductions = Fedtax + Statetax;
		Netpay = Grosspay - Deductions;
		
		//Output window all on one line using \n NO CONSOLEEE
		
		System.out.println("\nName: " + Name +
			"\n" + "Hours: " + Hours +
			"\n" + "Payrate: " + Payrate +
			"\n" + "Gross Pay: " + Grosspay +
			"\n" + "\t Federal Tax: " + Fedtax +
			"\n" + "\t State Tax: " + Statetax +
			"\n" + "\t\t Total Deductions: " + Deductions +
			"\n" + "\t\t Netpay: " + Netpay);
	}

}

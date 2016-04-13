import java.util.Scanner;

public class LoanToComputeInterestRate {
          public static void main(String[] args) {	
				//Initialization
				double InterestRate = 5;
				double CurrR = 0;
		
				Scanner input = new Scanner(System.in);

				System.out.print("Please enter the loan amount (ex:00.00): ");
				double LoanAmount = input.nextDouble();
				System.out.print("Please enter the number of years: ");
				int Years = input.nextInt();
				

		
				double monthlyInterestRate = LoanAmount / 1200;
				double monthlyPayment = LoanAmount * monthlyInterestRate/ (1 -1 / Math.pow(1 + monthlyInterestRate, Years * 12));
				double totalPayment = monthlyPayment * Years * 12;
				
				
				for (int i=0; i < 25; i++){
					CurrR = InterestRate + 0.125 * i;
					monthlyInterestRate = CurrR / 1200;
					//monthlyPayment *=  0.125 * i;
					//System.out.println(CurrR +" "+" "+ monthlyPayment +" "+ totalPayment);
					monthlyPayment = LoanAmount * monthlyInterestRate/ (1 -1 / Math.pow(1 + monthlyInterestRate, Years * 12));
					totalPayment = monthlyPayment * Years * 12;
					System.out.printf("%-20.2f" + "%-20.2f" + "%-20.2f\n", CurrR, monthlyPayment, totalPayment);
					
				}
				
				
				System.out.println();	
				System.out.println("Loan Amount: " + LoanAmount);
				System.out.println("Number of Years: " + Years);
				System.out.println();			

				}

	}




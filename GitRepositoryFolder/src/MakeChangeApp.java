

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefan
 */      
import java.util.Scanner;


public class MakeChangeApp {
       public static void main(String[] args) 
	  {
            Scanner scan=new Scanner(System.in);
        double amt;
        int ten,five,one,quarter,dime,nickel,totalCents;

        System.out.println("Please enter the amount to be changed");
        amt=scan.nextDouble();

        totalCents=(int)amt;	
        totalCents= (int) (100*amt);

        ten=(totalCents/1000);
        five=(int) ((amt-(ten*10))/5); //(totalCents/500);
        one=(int) ((amt-(ten*10)-(five*5))/1);
        quarter=(int) ((amt-(ten*10)-(five*5)-(one*1))/.25);
        dime=(int) ((amt-(ten*10)-(five*5)-(one*1)-(quarter*.25))/.10);
        nickel=(int) ((amt-(ten*10)-(five*5)-(one*1)-(quarter*.25)-(dime*.10))/.05);


        System.out.println("Ten dollar bills: " + ten);
        System.out.println("Five dollar bills: " + five);
        System.out.println("One dollar bills: " + one);
        System.out.println("Quarters: " + quarter);
        System.out.println("Dimes: " + dime);
        System.out.println("Nickels: " + nickel);
   // return;
}
}  
              

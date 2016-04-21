
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12208084
 */

public class ExceptionTryCatch {
    //public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                boolean continueInput = true;
                do{
                try{
                    System.out.print("Enter an integer: ");
                    int number = input.nextInt();
                    System.out.println(
                    "The number enterd is " + number);
                    continueInput = false;
                  }
                catch (InputMismatchException ex){
                 System.out.print("Try again.  (" + 
                         "Incorrect input: An integer is required)");
                 input.nextLine();                }
                }while (continueInput);
                }
    }

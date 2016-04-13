

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefan
 */      
import static com.sun.javafx.geom.Point2D.distance;
import static com.sun.javafx.geom.Vec2d.distance;
import static com.sun.javafx.geom.Vec2f.distance;
import static java.awt.geom.Point2D.distance;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.sqrt;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.File;
import java.util.Scanner;
import javax.swing.*;
import java.io.*; 
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;


public class InputMismatchExceptionDemo {
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

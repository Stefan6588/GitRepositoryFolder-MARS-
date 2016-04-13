

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


public class ArrayMAXMIN {
          public static void main(String[] args){
		Scanner scanner = new Scanner (System.in); 
		int rows; 
		int columns;
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt(); 
		System.out.println (" Now enter the number of columns:\n "); 
		columns = scanner.nextInt(); 
		int [][] matrix = new int [rows] [columns];
		for (int i = 0; i < rows; i++) {
		for (int j = 0; j < columns; j++) {
		System.out.println("Enter the number for row " + i + " and column " + j + " : ");
		matrix [i][j] = scanner.nextInt();
		////////////////////////////////////////////////////////////
		/*
		System.out.println("Matrix A: ");
		    for (int i1 = 0; i1 < matrix .length; i1++) {
		       System.out.println();
		       for (int j1 = 0; j1 < matrix [i].length; j1++) {
		          System.out.print(matrix [i1][j1] + " ");
		       }
		    }*/
		//////
		}
		}
		
		 
		System.out.println("Matrix A: ");
		for (int i1 = 0; i1 < matrix .length; i1++) {
		   System.out.println();
		   for (int j1 = 0; j1 < matrix [i1].length; j1++) {
		      System.out.print(matrix [i1][j1] + " ");
		   }
		}
		///******** Ending the displaying module***************////
		///*********starting the displaying the max vlaue of given array***************////


		int maxValue = Integer.MIN_VALUE;
		 
		System.out.println("\nMax values in 2D array: ");
		for (int i2 = 0; i2 < matrix.length; i2++)
		    for (int j2 = 0; j2 < matrix[i2].length; j2++)
		        if (matrix[i2][j2] > maxValue)
		           maxValue = matrix[i2][j2];
		 
		System.out.println("Maximum value: " + maxValue);
		 
		//******Ending the Min value of given array***********************////
		//******Finding the Min value of array****************************////
		int minValue =Integer.MAX_VALUE;
		 
		System.out.println("\nMin values in 2D array: ");
		for (int i2 = 0; i2 < matrix.length; i2++)
		    for (int j2 = 0; j2 < matrix[i2].length; j2++)
		        if (matrix[i2][j2] < minValue)
		           minValue = matrix[i2][j2];
		 
		System.out.println("Minimum value: " + minValue);
		 
		//**** End of Finding the max value of an array****************////
		}
		
}

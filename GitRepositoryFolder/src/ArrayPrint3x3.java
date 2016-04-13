

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefan
 */      
import java.io.IOException;
import java.util.Scanner;

public class ArrayPrint3x3 {
    public static void main(String[]args){
	int[][] matrix = new int[3][3];
            for (int i =0; i < 3; i++){
                for (int j =0; j < 3; j++){
                    matrix[i][j] = (i+1) + (j+1);
	 	}
	  }
	  boolean found = false;
	  int i = 0;
            while (!found && i < 3){
          int j = 0;
            while (!found && j < 3){
	  if (matrix[i][j] ==  2){
	  found = true;
                }
             }
	 }
	System.out.println("The matrix is:");
	for (i=0; i < 3; i++){
            for (int j=0; j <3; j++){
                System.out.print(matrix[i][j] + " ");
        }
                System.out.println();
            }
                System.out.println();
	}
    }
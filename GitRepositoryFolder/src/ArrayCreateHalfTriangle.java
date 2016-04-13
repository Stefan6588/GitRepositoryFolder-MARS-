

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefan
 */      

public class ArrayCreateHalfTriangle {
       public static void main(String[] args) 
	  {
	  //int TwoDarray[][]=new int[0][0];
	  int k=0;
	  for (int i=0; i<10; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" "+ k);
                k++;
            }
            System.out.println(" ");
            }
	  }
	}
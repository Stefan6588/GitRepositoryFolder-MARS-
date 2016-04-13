

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefan
 */      

public class ChronologicalArray10r5c {
    public static void main(String[]args){
	int[][] a2 = new int[10][5];
	
	  for (int i=0; i<a2.length; i++) {
		  for (int j=0; j<a2[i].length; j++) {
			  a2[i][j] = i;
			  	System.out.print(" " + a2[i][j]);
		  }
		  		System.out.println("");
	  }
	  }
	}
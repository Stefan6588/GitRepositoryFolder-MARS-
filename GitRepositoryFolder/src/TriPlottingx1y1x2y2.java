

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

public class TriPlottingx1y1x2y2 {
     public static void main(String[] args){
 
        double x1, y1, x2, y2;
 
        Scanner in = new Scanner(System.in);
 
        System.out.println ("Please enter x and y values for two points");
 
        x1 = in.nextDouble();
 
        System.out.println(" ");
         
        x2 = in.nextDouble();
         
        System.out.println ("Pleas enter values for y." );
 
        y1 = in.nextDouble();
         
        y2 = in.nextDouble();
 
        System.out.println(" ");
 
        System.out.println ("The coordinate of the points you have entered is" + "(" + x1 + "," + y1 + ")" + " and " + "( " + x2 + "," + y2 + " )" );
 
        //float Distance = sqrt((x2-x1)(x2-x1) + (y2-y1)(y2-y1));

        double Distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 
         
    }
}


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

public class TriDistanceBetween2Points {
     public static void main(String[] args){
        double x1, x2, y1, y2;
        double distance;
      
         
        Scanner scan = new Scanner (System.in);
         
        System.out.println("Enter the x coordinate for point 1: ");
        x1 = scan.nextDouble();
         
        System.out.println("Enter the y coordinate for point 1: ");
        y1 = scan.nextDouble();
         
        System.out.println("Enter the x coordinate for point 2: ");
        x2 = scan.nextDouble();
         
        System.out.println("Enter the y coordinate for point 2: ");
        y2 = scan.nextDouble();
         
        distance = distance(x1,y1,x2,y2);
         
        System.out.println("The distance between the two points is " + distance + " .");
         
		//return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }

	private static double distance(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
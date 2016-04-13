

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
import java.util.Scanner;
import java.io.File;
import java.util.Scanner;
import javax.swing.*;
import java.io.*; 
import java.util.Arrays;
import static java.util.Collections.list;

public class TriangulationWithDistance {
          public static void main(String[] args) {    
    Scanner scan = new Scanner (System.in);
      
        System.out.println("Enter the x coordinate for point 1: ");
        double x1 = scan.nextDouble();
         
        System.out.println("Enter the y coordinate for point 1: ");
        double y1 = scan.nextDouble();
         
        System.out.println("Enter the x coordinate for point 2: ");
        double x2 = scan.nextDouble();
         
        System.out.println("Enter the y coordinate for point 2: ");
        double y2 = scan.nextDouble();
         
        double distance = (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
        System.out.println("The distance between the two points is " + distance + " .");
         
		//return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
       // return 0;
    }
}



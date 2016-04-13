

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
import java.io.*; 

public class TriPlottingxWithDistanceAndException { 
        int x1,y1,x2,y2,difx,dify;    
        double d; 

void get() throws IOException{      
BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Enter the X part of first point : ");
            x1=Integer.parseInt(Br.readLine()); 
	System.out.print(" Enter the Y part of first point : ");      
            y1=Integer.parseInt(Br.readLine()); 
        System.out.print("\n Enter the X part of second point : "); 
            x2=Integer.parseInt(Br.readLine()); 
        System.out.print(" Enter the Y part of second point :  ");      
            y2=Integer.parseInt(Br.readLine());   } 

void display()   {         
    difx = (x2 - x1) * (x2 - x1);  
    dify = (y2 - y1) * (y2 - y1);  
    d = Math.sqrt(difx + dify);       
        System.out.println("\n Distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is : " + d + " unit(s) " );   }  

public static void main(String p[]) throws IOException{    
	distance dis = new distance();    
	dis.get();    
	dis.display();  

    } 
}
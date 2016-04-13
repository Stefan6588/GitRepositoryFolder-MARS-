

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
import java.util.List;

public class PenniesPerDayAppBETTER {
    public static void main(String[] args) {

    int maxDays; // number of days

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Get the number of days.
    System.out.print("Days of work? ");
    maxDays = keyboard.nextInt();

    // Validate the input.
    while (maxDays < 1) {
        System.out.print("The number of days must be greater than 0.\n"
                + "Re-enter the number of days: ");
        maxDays = keyboard.nextInt();
    }
    // close scanner
    keyboard.close();

    // Display the report header.
    System.out.println("Day\t\tPennies Earned");

    // call getPay to calculate total amount of pay
    // passing in a start penny of 1 and
    // max days entered by user
    List<Double> pay = getPay(maxDays, 1);
    for (int x = 0; x < pay.size(); x++) {
        System.out.println((x + 1) + "\t\t" + pay.get(x));
    }

    // Create a DecimalFormat object to format output.
    DecimalFormat dollar = new DecimalFormat("#,##0.00");

    // calculate totalPay with java 8
    double totalPay = pay.stream().mapToDouble(Double::doubleValue).sum();
    System.out.println("Total pay: $" + dollar.format(totalPay / 100.0));
}

/**
 * The method will calculate the pay period based on parameters passed.
 * 
 * @param numberOfDays
 * @param pennies
 * @return list of pay period
 */
public static List<Double> getPay(int totalNumberOfDays, int pennies) {

    List<Double> pay = new ArrayList<>();

    // add first day
    pay.add(new Double(1));

    int day = 1;
    while (day < totalNumberOfDays) {
        pay.add(new Double(pennies *= 2));
        day++;
    }

    return pay;
}
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author 12208084
 */
public class Read {
    public static void main(String[] args) throws Exception {
        // Create a File instance
        java.io.File file = new java.io.File("D:\\read.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);
        // Read data from a file
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(
            firstName + " " + mi + " " + lastName + " " + score);
            }

            // Close the file
            input.close();
 }
 }


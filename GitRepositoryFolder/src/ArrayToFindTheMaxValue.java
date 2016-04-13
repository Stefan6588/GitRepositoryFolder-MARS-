

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
import javax.swing.JOptionPane;

public class ArrayToFindTheMaxValue {
    public static void main(String[]args){
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        int array[]=new int[15];
        for(int i=0;i<array.length;i++){
            int num=input.nextInt();
            array[i]=num;
        }
        int maxValue = array[0];
        for(int i=1;i < array.length;i++){
        if(array[i] > maxValue){
        maxValue = array[i];
        }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==maxValue){
                count++;
            }
        }
        System.out.println("Largest No: "+maxValue+" which occur "+count+" times.");
        }
}
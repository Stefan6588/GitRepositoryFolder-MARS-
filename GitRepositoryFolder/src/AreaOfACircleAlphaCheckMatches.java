

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
public class AreaOfACircleAlphaCheckMatches {
       public static void main(String[]args){
        //Area of circle pi*r^2
        Scanner sc = new Scanner(System.in);
        double Area,parseHolder;
        String radius;
        System.out.println("Please enter the radius: ");
        radius = sc.nextLine();
        String checkNoLetters = "([a-zA-Z])";
        
        if(radius.matches(checkNoLetters)){
            System.out.println("No letter input please!");
        }else{
            parseHolder = Double.parseDouble(radius);
            if(parseHolder>0)
            {
                Area = Math.PI * Math.pow(parseHolder,2);
                System.out.println(Area);
            }else{
                System.out.println("No negative number!");
            }
            
        }
    }
}
    
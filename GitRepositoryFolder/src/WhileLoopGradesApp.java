

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stefan
 */      
import javax.swing.JOptionPane;

import java.util.Scanner;


public class WhileLoopGradesApp {
          public static void main(String[] args) {
		char lGrade = 'F';
		int grade = 0;
		int count=0;
		
		String stgrade = JOptionPane.showInputDialog(null, "Enter your grade (0-100):",
				"Java Class", JOptionPane.QUESTION_MESSAGE);
		grade = Integer.parseInt(stgrade);
		
		while ((grade < 0) || (grade > 100))
		{
			JOptionPane.showMessageDialog(null, "Invalid grade. Grade must be in between 0 and 100.");
			if (count > 3)
			{
				JOptionPane.showMessageDialog(null, "This was your last chance. Bye");
				break;
			}
			stgrade = JOptionPane.showInputDialog(null, "Enter your grade (0-100):",
					"Java Class", JOptionPane.QUESTION_MESSAGE);
			grade = Integer.parseInt(stgrade);
			count++;
		}

		if (grade < 70)
			lGrade = 'F';
		else if (grade < 80){
			lGrade = 'C';
			if ((grade >= 70) && (grade < 75))
				JOptionPane.showMessageDialog(null, "See me after class");
		}
		else if (grade < 90)
			lGrade = 'B';
		else 
			lGrade = 'A';			
		JOptionPane.showMessageDialog(null, "Your grade is " + lGrade);
	}

}


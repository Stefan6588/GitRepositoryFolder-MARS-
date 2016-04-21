
import java.io.*;
import java.util.*;
/**
 *
 * @author 12208084
 * The exit status code 1, 2, and 3 are used to indicate these abnormal terminations
(lines 10, 17, 24).
 */
public class ReplaceText {
     public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 4) {     //check command usage
            System.out.println(
                "Usage: java ReplaceText sourceFile");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {     //source file exists?
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Check if target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {      //target file exists?
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        try (
        // Create input and output files        (try-with-resources)
            Scanner input = new Scanner(sourceFile);            //create scan
            PrintWriter output = new PrintWriter(targetFile);   //create PrintWriter
        ) {
        while (input.hasNext()) {               //has next?
            String s1 = input.nextLine();       //read a line
            String s2 = s1.replaceAll(args[2], args[3]);
            output.println(s2);
            }
        }
    }
 }

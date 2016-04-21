
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Stefan
 */

public class fstreamOUTWriteFilesToBinary {
    public static void main(String[] args)throws IOException {	
       
        //array to write to file
        int[] numbers = { 2, 4, 6, 8, 10, 12, 14};
    
        FileOutputStream fstream = new FileOutputStream ("D://Numbers.dat");
        
        DataOutputStream outputFile = new DataOutputStream (fstream);
        
        System.out.println(" Writing the numbers to the file...");
        
        //write the arrat elements to the file. 
        for(int i = 0; i<numbers.length; i++)
            outputFile.writeInt(numbers[i]);
        System.out.println("Done. ");
        
        //close the file
        outputFile.close();
    }
    
}

    
    
    
    

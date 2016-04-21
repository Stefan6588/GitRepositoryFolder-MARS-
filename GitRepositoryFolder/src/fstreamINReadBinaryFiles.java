
import java.io.DataInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileInputStream;


/**
 *
 * @author Stefan
 */

public class fstreamINReadBinaryFiles {
    public static void main(String[] args)throws IOException {	
       
        //array to write to file
        int number; //a number to be read into file
        boolean endOfFile = false; // EFO Flag
        
        FileInputStream fstream = new FileInputStream ("G:\\UTFnames.dat");
        
        DataInputStream inputFile = new DataInputStream (fstream);
        
        System.out.println("Reading numbers from the file...  ");
        
        while (!endOfFile)
        {
            try
            {
                number = inputFile.readInt();
                System.out.print(number + " ");
            }
                catch (EOFException e)
                {
                    endOfFile = true;
                }
            
         }
  
            System.out.println("Done. ");
        
            //close the file
            inputFile.close();
    
  
  }
}
    

    
    
    

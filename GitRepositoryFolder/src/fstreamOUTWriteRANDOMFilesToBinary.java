
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Stefan
 */

public class fstreamOUTWriteRANDOMFilesToBinary {
    public static void main(String[] args)throws IOException {	
        //write array to binary file
        char[] letters = {'a','b','c','d','e','f','g','h','i','j',
                            'k','l','m','n','o','p','q','r','s','t',
                            'u','v','w','x','y','z'};
                
        System.out.println("Opening the file...  ");
        RandomAccessFile randomFile = new RandomAccessFile ("G:\\names.dat", "rw");
        
        System.out.println("Writing data to the file...  ");
        
        //sequentially write the letters array to the file
        for (int i =0; i < letters.length; i++)
            randomFile.writeChar(letters[i]);
        //close
        randomFile.close();
        System.out.print("Done");
    }
}
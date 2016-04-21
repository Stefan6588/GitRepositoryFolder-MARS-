
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

public class randomAccessFileSEEK {
    public static void main(String[] args)throws IOException {	
          
        final int CHAR_SIZE = 2;
        long byteNum;
        char ch;
        
        RandomAccessFile randomFile = new RandomAccessFile ("G:\\names.dat", "r");
        //remember count starts at 0
        //result from names.dat (array with 'a' - 'z')
        //resultshows f k d, respectively position 5, 10, 3
        byteNum = CHAR_SIZE * 5;
        randomFile.seek(byteNum);
        ch = randomFile.readChar();
        System.out.println(ch);
        
        byteNum = CHAR_SIZE * 10;
        randomFile.seek(byteNum);
        ch = randomFile.readChar();
        System.out.println(ch);
        
        byteNum = CHAR_SIZE * 3;
        randomFile.seek(byteNum);
        ch = randomFile.readChar();
        System.out.println(ch);
        
        randomFile.close();   
    }
}

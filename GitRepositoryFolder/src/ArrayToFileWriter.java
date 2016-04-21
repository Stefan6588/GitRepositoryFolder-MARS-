
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Stefan
 */

public class ArrayToFileWriter {
    public static void main(String[] args)throws Exception {	
        FileWriter fw = new FileWriter("G:\\file.dat");
        String strs[] = { "com", "exe", "doc" };

        for (int i = 0; i < strs.length; i++) {
            fw.write(strs[i] + "\n");
        }
            fw.close();
      }
}

    
    
 

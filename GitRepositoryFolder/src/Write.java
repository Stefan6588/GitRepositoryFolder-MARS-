/**
 *
 * @author 12208084
 */
public class Write {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        java.io.File file = new java.io.File("D:\\write.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        try (
        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        ) {
        // Write formatted output to the file
            output.print("Write action performed ");
            output.println(1);
            
        }
    }
 }

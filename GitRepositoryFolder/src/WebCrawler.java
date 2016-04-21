import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 12208084
 */
public class WebCrawler {
 public static void main(String[] args) {
 java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a URL: ");
    String url = input.nextLine();
    crawler(url); // Traverse the Web from the a starting url
 }

 public static void crawler(String startingURL) {
    ArrayList<String> listOfPendingURLs = new ArrayList<>();    //LIST PENDING URLS
    ArrayList<String> listOfTraversedURLs = new ArrayList<>();  //LIST TRAVERSED URLS

    listOfPendingURLs.add(startingURL); //STARTING URL
    while (!listOfPendingURLs.isEmpty() &&
        listOfTraversedURLs.size() <= 100) {
        String urlString = listOfPendingURLs.remove(0);     //FIRST URL
        if (!listOfTraversedURLs.contains(urlString)) {
            listOfTraversedURLs.add(urlString);
            System.out.println("Craw " + urlString);    //URL TRAVERSED

        for (String s: getSubURLs(urlString)) {
        if (!listOfTraversedURLs.contains(s))
            listOfPendingURLs.add(s);                   //ADD A NEW URL
            }
        }
    }
 }

 public static ArrayList<String> getSubURLs(String urlString) {
    ArrayList<String> list = new ArrayList<>();

    try {
        java.net.URL url = new java.net.URL(urlString);
        Scanner input = new Scanner(url.openStream());
        int current = 0;
        while (input.hasNext()) {
            String line = input.nextLine();             // READ A LINE
            current = line.indexOf("http:", current);   //SEARCH FOR URL
            while (current > 0) {                       //END OF URL
                int endIndex = line.indexOf("\"", current);
                if (endIndex > 0) {                      // Ensure that a correct URL is found
                    list.add(line.substring(current, endIndex));    //EXTRACT URL
                    current = line.indexOf("http:", endIndex);      //ADD A NEW URL
        }
                else
                current = -1;
            }
        }
     }
    catch (Exception ex) {
        System.out.println("Error: " + ex.getMessage());
    }
    return list;
    }
 }

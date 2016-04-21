import java.io.RandomAccessFile;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

import java.io.IOException;


/**
 *
 * @author Stefan
 */

public class SortMethods {
    public static void main(String[] args)throws IOException {	
     int[] array = {7,3,9,2,0,1,8,4,6,5};
        System.out.println("Before the sort:  ");
            for (int i =0; i <10; i++)
                System.out.println(array[i] + " ");
            System.out.println();
        
        //SORT THE ARRAY.
        quickSort(array, 0 , 9);
        //DISPLAY THE ARRAY AGAIN  
        System.out.println("After the sort: ");
            for (int i =0; i <10; i++)
                System.out.println(array[i] + " ");
            System.out.println();

    }
    
    public static void quickSort(int array[], int start, int end) {
        int pivotPoint;
                if (start < end){
                    pivotPoint = partition (array, start, end);
                    
                    quickSort(array, start, pivotPoint - 1);
                    
                    quickSort(array, pivotPoint + 1, end);
                }
    }        
                
    private static int partition(int array[], int start, int end) {
        int pivotValue, pivotIndex, mid;
        
        mid = (start + end)/2;
        
        swap(array, start, mid);
        pivotIndex = start;
        pivotValue = array [start];
        
        for (int scan = start+ 1; scan <= end;scan++){
            if (array[scan] < pivotValue){
                pivotIndex++;
                swap(array, pivotIndex, scan);
            }
        }
        swap(array, start, pivotIndex);
        return pivotIndex;
    }
    
    public static int swap(int array[], int a, int b) {
        int temp;
        
        temp = array[a];
        array[a]=array[b];
        array[b]=temp;
        return 0;
    }
    
    
}



// import java.util.Scanner;

import java.util.Arrays;

public class Array {
    public static void main(String args[]){
        int [] array = {5,7,3,4,1};
        System.out.println("unSorted array: " +Arrays.toString(array));

        //Arrays.sort(array);
        Sorting.bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Hi i am Harry");
        // System.out.println("unSorted array: " +Arrays.toString(array));
        // 

        //for taking inputs from the user for array

        // for(int i = 0 ; i < 5 ; i++){
        //     System.out.println("Enter the number you want to add at "+i+" index : ");
        //     array[i] = sc.nextInt();
        // }

        //printing the value off index given by user 
        
        // System.out.println("Enter the index for which you want a value from an array : ");
        // int index = sc.nextInt();
        // System.out.println("The value at index "+index+" is : " +array[index]);

        //linear search

        // for (int i = 0 ; i < array.length ; i++){
        //     if (array[i] == 8 ){
        //         System.out.println("the index of the value is : " +i);
        //     }

        // }

        //sorting the array 
 
    }
    class Sorting{
        static void bubbleSort(int []array){
            int size = array.length;

            for(int i = 0 ; i < size-1 ; i++){
                for(int j = 0 ; j < size-i-1 ; j++){
                    if(array[j] > array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                    else {
                        
                        
                    }

                }
            
            }
        }
    }
}
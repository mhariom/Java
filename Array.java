import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        int [] array = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Enter the number you want to add at "+i+" index : ");
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the index for which you want a value from an array : ");
        int index = sc.nextInt();
        System.out.println("The value at index "+index+" is : " +array[index]);

    }
}
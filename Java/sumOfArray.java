import java.util.Arrays;

public class sumOfArray {
    public static void main(String []args){
        String []array = {"p","a","s","s"};
        String []array2 = {"f","a","i","l"};
       
         addingStringArrays.addArray(array, array2);

    }
    class addingStringArrays{
        static void addArray(String []array, String []array2){
            int size = array.length;
            System.out.println(size);
            int size2 = array2.length;
            System.out.println(size2);

            String s1 ;
            String s2 ;
            
            int newArrayLength = size+size2;

            //created this array as a resultant array 
            String []twoArray = new String[newArrayLength];
            // String []twoArray ;

            for (int i = 0 ; i < size ; i++){
                s1 = array[i];
                twoArray = {array[i]};

            }
            for (int i = 0 ; i < size ; i++){
                s2 = array[i];
            }
            
            System.out.println(Arrays.toString(twoArray));
        }
    }
}

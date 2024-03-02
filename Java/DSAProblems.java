public class DSAProblems {

    public static void pair(int[]arr){
        int target = 10 ;
        int[] arrResult = new int[2];
        
        int len = arr.length;
        for (int i = 0 ; i < len; i++ ){
            for(int j = 1 ; j < len ; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println("pair found : "+arr[i]+","+arr[j]);
                    return ;
                }else {
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {8, 7, 2, 5, 3, 1};
        pair(arr);
	}
}

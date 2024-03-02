public class count
{
    public static String count(String Str,String []arr){
        String result;
        int countStar = 0;
        int countQuestion = 0;
            for (char character : Str.toCharArray()){
                // Check if the character is a star
                if (character == '*') {
                    countStar += 1;
                }else{
                    countQuestion += 1;
                }
            }
        result = arr[countStar-1]+" "+arr[countQuestion-1];

        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String Str = "*****???";
        System.out.println(count(Str,arr));
		
	}
}

public class Reverse {

	public static void main(String[] args) {
		System.out.println(reverseIter("Hello"));
		System.out.println(reverseRecursive("Hello"));
	}

	private static String reverseIter(String str){
		char temp;
	    char[] arr = new char[str.length()];
	    arr = str.toCharArray();
	    int len = arr.length-1;
	    for(int i = 0 ; i < str.length()/2 ; i++){
	        temp = arr[i];
	        arr[i]=arr[len];
	        arr[len]=temp;
	        len--;
	    }
		return String.valueOf(arr);
		
	}
	
	private static String reverseRecursive(String str){
		if (str.length() == 0) {
			return str;
		}
		return reverseRecursive(str.substring(1)) + str.charAt(0);		
	}
	
}

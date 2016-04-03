
public class UniqueNumberInArray {

	public static void main(String[] args) {
		int[] arr = {4, 1, 5, 2, 4, 1, 2};
		System.out.println(findUniqueNumber(arr));

	}

	public static int findUniqueNumber(int[] arr){
		int num=0;
		for (int i = 0; i < arr.length; i++) {
			num^=arr[i];
		}
		return num;
	}
}

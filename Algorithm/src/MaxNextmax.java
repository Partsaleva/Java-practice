
public class MaxNextmax {

	public static void main(String[] args) {
		int[] arr = {7, 2, -5, 6, 3, 8, 4, -2};
		findMaxAndSecMax(arr);

	}

	public static void findMaxAndSecMax(int[] arr){
		int max=arr[0],currMax=0,keepNext=0;
		for (int i = 1; i < arr.length; i++) {
			currMax=arr[i];
			if (currMax>max) {
				keepNext=max;
				max=currMax;
				currMax=keepNext;			
			}			
			if (currMax>keepNext) {
				keepNext=currMax;
			}			
			currMax=0;						
		}
		System.out.println("Max: "+max+", Nextmax: "+keepNext);
	}
}

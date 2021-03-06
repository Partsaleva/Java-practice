

public class MaxSumSubArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, -5, 6, 3, -1, 4, -2, 3, 3, -2, 3};
		int[] arr1 = {1, 2, -5, 6, -1, 4, -2, 3, -40, -2, 3};
		int[] arr2 = {-1, -2, -5, -6, -1,-4, -2, -3, -40, -2, -3};
		int[] arr3 = {-1, -2, -5, -6, -1,-4, -2, -3, 0, -2, -3};
		int[] arr4 = {-5, -6, 4, -1, -2, 1, 5, -3};
		
		/*System.out.println(Arrays.toString(maxSubarray(arr)));
		System.out.println(Arrays.toString(maxSubarray(arr1)));
		System.out.println(Arrays.toString(maxSubarray(arr2)));
		System.out.println(Arrays.toString(maxSubarray(arr3)));
		System.out.println(Arrays.toString(maxSubarray(arr4)));*/
		
		System.out.println(maxSubarray(arr));
		System.out.println(maxSubarray(arr1));
		System.out.println(maxSubarray(arr2));
		System.out.println(maxSubarray(arr3));
		System.out.println(maxSubarray(arr4));
		
	}
	
	public static int maxSubarray(int[] arr) {
		int begin = 0, end = 0;
		int currentMax = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > currentMax + arr[i] ) {
				currentMax = arr[i];
				begin+=1;
			} else {
				currentMax += arr[i];
			}

			if (max < currentMax) {
				max=currentMax;
				end=i;
				
			}
			
			// for tests
			//currentMax = Math.max(arr[i], currentMax + arr[i]);
			//max = Math.max(max, currentMax);
		}
		
		System.out.println(begin+" "+ end);
		return max;
		//return Arrays.copyOfRange(arr, begin, end);
	}
	
	
	
	
	
}
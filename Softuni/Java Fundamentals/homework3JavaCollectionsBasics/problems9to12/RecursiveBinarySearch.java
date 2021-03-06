package homework3JavaCollectionsBasics.problems9to12;
/*Problem 11. * Implement Recursive Binary Search
Binary search is an algorithm that works on already sorted arrays. 
Basically, it goes to the middle element and checks it has to continue 
searching to the left, or to the right. Return the index of the element, 
or -1, if the element is not found.*/
public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,4,5};
        System.out.println(search(5, arr));
        arr=new int[]{1,2,3,4};
        System.out.println(search(5, arr));
        arr=new int[]{4,4,4,4,4,8,8,8,8};
        System.out.println(search(4, arr));
        arr=new int[]{4,4,4,4,4,8,8,8,8};
        System.out.println(search(8, arr));
    }

    public static int search(int num, int[] arr) {
        return binarySearch(arr, 0, arr.length-1, num);
        
    }
    
    private static int binarySearch(int[] a, int start, int end, int num) {
        int middle = (start + end) / 2;
        if(end < start) {
            return -1;
        } 
        if(num==a[middle]) {
            return middle;
        } else if(num<a[middle]) {
            return binarySearch(a, start, middle - 1, num);
        } else {
            return binarySearch(a, middle + 1, end, num);
        }
    }

}

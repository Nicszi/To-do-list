public class BinarySearch {
    public static int findIndex(int[] arr, int t){
        if (arr == null){
            return -1;
        }

				int lowerBound = 0;
				int upperBound = arr.length - 1;
				int index = -1; 

				while(lowerBound <= upperBound) {
				 int  mid = (lowerBound + upperBound) / 2;

				 if (arr[mid] == t) {
					index = mid;
					break;
				 } else if (arr[mid] < t) {
					lowerBound = mid + 1;
				 } else {
					upperBound = mid - 1;
				 }
				}
        
 
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,12,25,35};
        int itemToSearch = 5;
        System.out.println(findIndex(arr,itemToSearch));
    }
}
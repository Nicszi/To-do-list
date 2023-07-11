public class Main{

	public static int partition(int arr[], int less, int higher)
	{
		int pivot = arr[higher];
		int x = (less - 1); 
		for (int y = less; y < higher; y++)
		{

			if (arr[y] <= pivot)
			{
				x++;

				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
			}
		}

		int temp = arr[x+1];
		arr[x+1] = arr[higher];
		arr[higher] = temp;

		return x+1;
	}


	public static void sortedArray(int arr[], int less, int higher) {
		if (less < higher)
		{
			
			int pi = partition(arr, less, higher);

			sortedArray(arr, less, pi - 1);
			sortedArray(arr, pi + 1, higher);
		}
	}

	public static void ascendingOrder(int arr[])
	{
		int n = arr.length;
		for (int x = 0; x < n; ++x)
			System.out.print(arr[x] + ", ");
		System.out.println();
	}


	public static void main(String args[])
	{
		int arr[] = {5, 9, 1, 208, 23, 2, 3, 42, 12};
		int n = arr.length;
        
		sortedArray(arr, 0, n - 1);

		System.out.println("Sorted Array: ");
		ascendingOrder(arr);
	}
}
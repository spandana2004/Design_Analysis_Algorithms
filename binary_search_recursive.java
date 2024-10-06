package Module1;
import java.util.*;
public class binary_search_recursive {
	int binarySearch(int arr[], int l, int r, int x)
		{
			if (r >= l && l <= arr.length - 1) {
				int mid = l + (r - l) / 2;
				if (arr[mid] == x)
					return mid;
				if (arr[mid] > x)
					return binarySearch(arr, l, mid - 1, x);
				return binarySearch(arr, mid + 1, r, x);
			}
			return -1;
		}

		public static void main(String args[])
		{
			binary_search_recursive ob = new binary_search_recursive();
			int r;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of n:");
			r = sc.nextInt();
			int arr[]=new int[r];
			for(int i=0;i<r;i++)
				arr[i]=sc.nextInt();
			System.out.println("Enter the element to search:");
			int key=sc.nextInt();
			int result = ob.binarySearch(arr, 0, r - 1, key);
			if (result == -1)
				System.out.println("Element not present");
			else
				System.out.println("Element found at position "
								+ (result+1));
			sc.close();
		}
}

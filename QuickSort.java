package Module1;
import java.util.*;
public class QuickSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		quick_sort(a, 0 , n-1);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		sc.close();
	}
	static void quick_sort(int a[], int low, int high) {
		if(low<high) {
			int j = partion(a, low, high);
			quick_sort(a, low, j-1);
			quick_sort(a, j+1, high);
		}
	}
	
	static int partion(int a[], int low, int high) {
		int pivot = a[low];
		int i=low+1, j=high;
		while(i<=j) {
			if(a[i]<pivot)
				i++;
			else if(a[j]>pivot)
				j--;
			if(i<j)
				interchange(a,i,j);
		}
		a[low] = a[j];
		a[j] = pivot;
		return j;
	}
	
	static void interchange(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

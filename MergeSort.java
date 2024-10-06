package Module1;
import java.util.*;
public class MergeSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		merge_sort(a, 0 , n-1);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		sc.close();
	}
	static void merge_sort(int a[], int low, int high) {
		if(low<high) {
			int mid = (low+high)/2;
			merge_sort(a,low,mid);
			merge_sort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	static void merge(int a[], int low, int mid, int high) {
		int i=low, j=mid+1, k=low, pos;
		int temp[] = new int[a.length];
		
		while(i<=mid && j<=high) {
			if(a[i] < a[j]) {
				temp[k] = a[i];
				i++;
			}
			else {
				temp[k] = a[j];
				j++;
			}
			k++;
		}
		if(i > mid) {
			for(pos=j;pos<=high;pos++) {
				temp[k] = a[pos];
				k++;
			}
		}
		else {
			for(pos=i;pos<=mid;pos++) {
				temp[k] = a[pos];
				k++;
			}
		}
		
		for(pos=low;pos<=high;pos++) {
			a[pos] = temp[pos];
		}
	}
}

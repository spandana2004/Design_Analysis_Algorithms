package Module1;
import java.util.*;
public class Buble_Sort {
	public static void buble_sort(int a[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		buble_sort(a,n);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}

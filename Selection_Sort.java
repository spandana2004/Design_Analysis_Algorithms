package Module1;
import java.util.Scanner;
public class Selection_Sort {
	public static void selection_sort(int a[], int n) {
		int min;
		for(int i=0;i<n;i++) {
			min = a[i];
			for(int j=i+1;j<n;j++) {
				if(a[j] < min) {
					int temp = min;
					min = a[j];
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
		selection_sort(a,n);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		sc.close();
	}
}

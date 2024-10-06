package Module1;
import java.util.*;
public class MinMax {
	static int max, min, a[], n;
	public static void min_max(int i, int j) {
		int min1, max1, mid;
		if(i==j)
			max = min = a[i];
		else if(i==j-1){
			if(a[i]<a[j]) {
				min = a[i];
				max = a[j];
			}
			else {
				min = a[j];
				max = a[i];
			}
		}
		else {
			mid = (i+j)/2;
			min_max(i,mid);
			max1 = max;
			min1 = min;
			min_max(mid+1, j);
			
			if(max < max1)
				max = max1;
			if(min > min1)
				min = min1;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		min_max(0 , n-1);
		System.out.println("min: "+min+" max: "+max);
		sc.close();

	}
}

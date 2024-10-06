package Module1;
import java.util.*;
public class binary_search {
	public static void main(String args[]) {
	int r;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of n:");
	r = sc.nextInt();
	int arr[]=new int[r];
	for(int i=0;i<r;i++)
		arr[i]=sc.nextInt();
	int key, l=0, flag = 0, mid = 0;
	System.out.println("Enter the element to search:");
	key=sc.nextInt();
	while (l <= r) {
        mid = (l + r) / 2;
        if (arr[mid] == key) {
        	flag = 1;
            break;
        }
        else if (arr[mid] > key) {
            r = mid - 1;
        } else {
          l = mid + 1;
        }  
    }
	if(flag == 1) {
		System.out.println(key+" found at position:"+(mid+1));
	}
	else
		System.out.println(key+" not found");
	sc.close();
}
}

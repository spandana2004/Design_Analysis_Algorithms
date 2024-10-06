package Module;
import java.util.*;
public class CoinChange {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of coins:");
		n = sc.nextInt();
		int d[] = new int[n];
		System.out.println("enter the denomination of coins:");
		for(int i=0;i<n;i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		System.out.println("enter the amount to which change is required:");
		int amt = sc.nextInt();
		int coins[] = new int[n];
		System.out.println("the coins are:");
		for(int i=n-1;i>=0;i--) {
			coins[i] = amt/d[i];
			amt = amt % d[i];
			System.out.print(coins[i]+" ");
		}
	}
}

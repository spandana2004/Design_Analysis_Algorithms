package Module1;
import java.util.*;
public class Knapsack {
	int n;
	double m, p[], w[];
	public Knapsack(int n, double m, double p[], double w[]) {
		this.n = n;
		this.m = m;
		this.p = p;
		this.w = w;
	}
	
	void compute() {
		double sum=0, max;
		int i, j=0;
		while(m>=0) {
			max=0;
			for(i=0;i<n;i++) {
				if(p[i]/w[i] > max) {
					max = p[i]/w[i];
					j=i;
				}
			}
			if(w[j]>m) {
				System.out.println("Quantity of item number "+(j+1)+" added is "+m/w[j]);
				sum = sum+m*max;
				m=-1;
			}
			else {
				System.out.println("Quantity of item number "+(j+1)+" added fully.");
				m = m-w[j];
				sum = sum + p[j];
				p[j] = 0;
			}
		}
		System.out.println("total profit is: "+sum);
	}
}

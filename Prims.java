package Module1;
import java.util.*;
public class Prims {
	public static void main(String args[]) {
		int cost[][]=new int[10][10];
		int i,j,mincost=0;
		Scanner in = new Scanner(System.in);
		System.out.println("*************PRIMS ALGORITHM**************");
		System.out.println("enter the No. of nodes:");
		int n = in.nextInt();
		System.out.println("enter the cost matrix:");
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++)
				cost[i][j]=in.nextInt();
		}
		System.out.println("the entered cost matrix is:");
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++)
				System.out.print(cost[i][j]+"\t");
			System.out.println();
		}
		System.out.println("Minimum Spanning tree edges and cost are:");
		mincost=pr(cost,n,mincost);
		System.out.println("the minimum spanning tree cost is:"+mincost);
		System.out.println("*******************************************");
		
	}
	static int pr(int cost[][],int n, int mincost) {
		int nearV[] = new int[10];
		int t[][] = new int[10][3];
		int u=0,i,j,k;
		
		for(i=2;i<=n;i++)
			nearV[i]=1;
		
		nearV[1]=0;
		for(i=1;i<n;i++) {
			int min =999;
			for(j=1;j<=n;j++) {
				if(nearV[j]!=0 && cost[j][nearV[j]]<min) {
					min = cost[j][nearV[j]];
					u=j;
				}
			}
			t[i][1] = u;
			t[i][2] = nearV[u];
			mincost += min;
			nearV[u] = 0;
			
			for(k=1;k<=n;k++) {
				if(nearV[k]!=0 && cost[k][nearV[k]]>cost[k][u])
					nearV[k] = u;
			}
			System.out.println(i+" Minimum edge is "+t[i][1]+","+t[i][2]+" and its cost is: "+min);
		}
		return mincost;
	}
}

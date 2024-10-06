package Module1;
import java.util.*;
public class TopologicalSort {
	public static List<Integer> topological_sort(List<List<Integer>> adj, int V){
		int[] indegree = new int[V];
		
		for(List<Integer> list : adj)
			for(int vertex : list)
				indegree[vertex]++;
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<V;i++)
			if(indegree[i] == 0)
				q.add(i);
		
		List<Integer> result = new ArrayList<>();
		while(!q.isEmpty()) {
			int node = q.poll();
			result.add(node);
			
			for(int adjacent : adj.get(node)) {
				indegree[adjacent]--;
				if(indegree[adjacent] == 0)
					q.add(adjacent);
			}
		}
		if(result.size() != V) {
			System.out.println("Graph contains cycle.");
			return new ArrayList<>();
		}
		return result;
	}
	
	public static void main(String args[]) {
		int n = 3;
		List<List<Integer>> edges = Arrays.asList(Arrays.asList(0,1), Arrays.asList(1,2), Arrays.asList(0,2));
		
		List<List<Integer>> adj = new ArrayList<>();
		for(int i=0;i<n;i++)
			adj.add(new ArrayList<>());
		
		for(List<Integer> edge : edges)
			adj.get(edge.get(0)).add(edge.get(1));
		
		List<Integer> result = topological_sort(adj, n);
		
		for(int vertex : result)
			System.out.print(vertex + " ");
	}
}

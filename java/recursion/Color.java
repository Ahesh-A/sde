import java.util.List;
import java.util.ArrayList;

public class Color {
  public static boolean coloredAs(int i, int node, int[] color, List<Integer>[] edges) {
	List<Integer> neighbours = edges[node];
	for(Integer elem : neighbours) {
	  if(color[elem] == i) {
		return false;
	  }
	}

	return true;
  }
  public static boolean couldColorHelper(int n, int m, int node, List<Integer>[] edges, int[] color) {
//	System.out.println(node);
	if(node == n) {
	  return true;
	}
	
	boolean res = false;

	for(int i = 1; i <= m; i++) {
	  if(coloredAs(i, node, color, edges)) {
		color[node] = i;
		res = couldColorHelper(n, m, node + 1, edges, color);
		color[node] = 0;
	  }
	}

	return res;
  }
  public static boolean couldColor(int n, int m, List<Integer>[] edges) {
	int[] color = new int[n];
	return couldColorHelper(n, m, 0, edges, color);
  }
  public static void main(String[] args) {
	int n = 4;
	int m = 3;

	List<Integer>[] edges = new ArrayList[n];
	for(int i = 0; i < n; i++) {
	  edges[i] = new ArrayList<>();
	}
	edges[0].add(1);
	edges[0].add(2);
	edges[0].add(3);
	edges[1].add(0);
	edges[1].add(2);
	edges[2].add(0);
	edges[2].add(1);
	edges[2].add(3);
	edges[3].add(0);
	edges[3].add(2);

	boolean res = couldColor(n, m, edges);
	System.out.println(res);
  }
}

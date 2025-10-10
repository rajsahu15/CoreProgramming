import java.util.ArrayList;
import java.util.Stack;


public class TopoSortDAG {

    private static void dfs(int node, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;

        for (int neighbor : adj.get(node)) {
            if (vis[neighbor] == 0) {
                dfs(neighbor, vis, st, adj);
            }
        }

        st.push(node);
    }

    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {

        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adj);
            }
        }

        int[] ans = new int[V];
        int i = 0;
        while (!st.isEmpty()) {
            ans[i++] = st.pop();
        }

        return ans;
    }
}

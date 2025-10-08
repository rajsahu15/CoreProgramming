import java.util.ArrayList;

public class CycleDetectUndirected {

    private boolean dfsCheck(int node, int parent,
                             int[] vis, ArrayList<ArrayList<Integer>> adj) {
        
        vis[node] = 1;

        for (int adjacentNode : adj.get(node)) {
            
            if (vis[adjacentNode] == 0) {
                if (dfsCheck(adjacentNode, node, vis, adj)) {
                    return true;
                }
            }
            else if (adjacentNode != parent) {
                return true;
            }
        }
        
        return false;
    }

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];

        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (dfsCheck(i, -1, vis, adj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// The class containing the BFS logic
class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        // Assuming the graph is connected or we start traversal from node 0
        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            for (Integer it : adj.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}

// Main class to run the test
public class BreadthFirstSearchExample {
    public static void main(String[] args) {
        // Define the number of vertices (V) and the adjacency list (adj)
        int V = 5;

        // Initialize the adjacency list (ArrayList of ArrayLists)
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Define the edges of a sample graph (0-based indexing)
        // Graph structure:
        // 0 -- 1
        // | \  |
        // 4 -- 2 -- 3

        // Edge 0 -> 1 and 1 -> 0
        adj.get(0).add(1);
        adj.get(1).add(0);
        
        // Edge 0 -> 2 and 2 -> 0
        adj.get(0).add(2);
        adj.get(2).add(0);
        
        // Edge 0 -> 4 and 4 -> 0
        adj.get(0).add(4);
        adj.get(4).add(0);
        
        // Edge 1 -> 2 and 2 -> 1
        adj.get(1).add(2);
        adj.get(2).add(1);
        
        // Edge 2 -> 3 and 3 -> 2
        adj.get(2).add(3);
        adj.get(3).add(2);
        
        // Edge 4 -> 2 and 2 -> 4
        // (Note: We already added 0-4 and 0-2, we can also add 4-2)
        // adj.get(4).add(2); // If you want this edge
        // adj.get(2).add(4); // If you want this edge

        
        // Create an instance of the Solution class
        Solution solver = new Solution();

        // Call the BFS function
        ArrayList<Integer> result = solver.bfsOfGraph(V, adj);

        // Print the result
        System.out.println("Breadth-First Traversal starting from node 0:");
        System.out.println(result); // Expected output for this graph: [0, 1, 2, 4, 3] or [0, 2, 1, 4, 3] depending on adjacency list order
    }
}
import java.util.ArrayList;
public class cycleTestDetectUndirectedBfs {

    private static void testCycleDetection(String graphName, int V, ArrayList<ArrayList<Integer>> adj, cycleDetectBFSUndirected solver) {
        boolean result = solver.isCycle(V, adj);
        System.out.println("--- " + graphName + " ---");
        System.out.println("Vertices (V): " + V);
        System.out.println("Cycle detected: " + result);
        System.out.println("--------------------");
    }

    // Helper method to add an undirected edge symmetrically
    private static void addUndirectedEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        cycleDetectBFSUndirected solver = new cycleDetectBFSUndirected();

        // =======================================================
        // TEST CASE 1: Graph with a Cycle (Expected: true)
        // Edges: 1-2, 2-3, 3-1 (Triangle Cycle)
        // =======================================================
        int V1 = 4; // Nodes 0, 1, 2, 3
        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        for (int i = 0; i < V1; i++) {
            adj1.add(new ArrayList<>());
        }
        addUndirectedEdge(adj1, 1, 2);
        addUndirectedEdge(adj1, 2, 3);
        addUndirectedEdge(adj1, 3, 1); 
        
        testCycleDetection("Graph with Cycle (Triangle)", V1, adj1, solver);

        // =======================================================
        // TEST CASE 2: Acyclic Graph (Tree Structure) (Expected: false)
        // Edges: 0-1, 0-2, 1-3
        // =======================================================
        int V2 = 4;
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i < V2; i++) {
            adj2.add(new ArrayList<>());
        }
        addUndirectedEdge(adj2, 0, 1);
        addUndirectedEdge(adj2, 0, 2);
        addUndirectedEdge(adj2, 1, 3);
        
        testCycleDetection("Acyclic Graph (Tree)", V2, adj2, solver);
        
        // =======================================================
        // TEST CASE 3: Graph with a Self-Loop (Expected: true)
        // Edges: 0-1, 1-1 (Self-loop)
        // =======================================================
        int V3 = 2; // Nodes 0, 1
        ArrayList<ArrayList<Integer>> adj3 = new ArrayList<>();
        for (int i = 0; i < V3; i++) {
            adj3.add(new ArrayList<>());
        }
        addUndirectedEdge(adj3, 0, 1);
        adj3.get(1).add(1); // Self-loop 1-1
        
        testCycleDetection("Graph with Self-Loop", V3, adj3, solver);
    }
}


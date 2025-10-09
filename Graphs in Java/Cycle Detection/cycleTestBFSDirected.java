import java.util.ArrayList;

public class cycleTestBFSDirected {
    private static void testCycleDetection(String graphName, int V, ArrayList<ArrayList<Integer>> adj,
            CycleDetectDirectedBFS solver) {
        boolean result = solver.isCyclic(V, adj);
        System.out.println("--- " + graphName + " ---");
        System.out.println("Vertices (V): " + V);
        System.out.println("Cycle detected: " + result);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        CycleDetectDirectedBFS solver = new CycleDetectDirectedBFS();

        int V1 = 4;
        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        for (int i = 0; i < V1; i++) {
            adj1.add(new ArrayList<>());
        }
        adj1.get(0).add(1);
        adj1.get(1).add(2);
        adj1.get(2).add(3);
        adj1.get(3).add(1);

        testCycleDetection("Graph with Cycle", V1, adj1, solver);

        int V2 = 4;
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i < V2; i++) {
            adj2.add(new ArrayList<>());
        }
        adj2.get(0).add(1);
        adj2.get(0).add(2);
        adj2.get(1).add(3);
        adj2.get(2).add(3);

        testCycleDetection("Acyclic Graph (DAG)", V2, adj2, solver);
    }
}

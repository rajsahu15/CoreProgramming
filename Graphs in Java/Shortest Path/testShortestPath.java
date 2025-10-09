
public class testShortestPath {

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void testShortestPath(String graphName, int N, int M, int[][] edges, ShortestPathInDAG solver) {
        int[] shortestDistances = solver.shortestPath(N, M, edges);
        System.out.println("--- " + graphName + " ---");
        System.out.println("Graph Size (N): " + N);
        System.out.println("Shortest distances from source node 0:");
        System.out.println("Node Index:     0, 1, 2, 3, 4, 5");
        System.out.print("Distance:       ");
        printArray(shortestDistances);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        ShortestPathInDAG solver = new ShortestPathInDAG();

        // =======================================================
        // TEST CASE 1: Standard DAG (Source is Node 0)
        // N = 6 (Nodes 0 to 5)
        // Edges: u, v, wt
        // Expected Shortest Paths from 0:
        // Dist[0] = 0
        // Path 0->1: 2
        // Path 0->2: 1
        // Path 0->1->3: 2+3 = 5
        // Path 0->2->3: 1+2 = 3 <--- SHORTEST to 3
        // Path 0->2->4: 1+4 = 5
        // Path 0->1->3->4: 5+1 = 6 (not shortest to 4)
        // Path 0->2->4->5: 5+5 = 10
        // Expected Result: [0, 2, 1, 3, 5, 10]
        // =======================================================
        int N1 = 6;
        int M1 = 7;
        int[][] edges1 = {
                { 0, 1, 2 },
                { 0, 2, 1 },
                { 1, 3, 3 },
                { 2, 3, 2 },
                { 2, 4, 4 },
                { 3, 4, 1 },
                { 4, 5, 5 }
        };

        testShortestPath("Standard DAG Example", N1, M1, edges1, solver);

        // =======================================================
        // TEST CASE 2: DAG with Unreachable Node (Source is Node 0)
        // Node 5 is unreachable from node 0.
        // Expected Result: [0, 2, 1, 3, 5, -1]
        // =======================================================
        int N2 = 6;
        int M2 = 6;
        int[][] edges2 = {
                { 0, 1, 2 },
                { 0, 2, 1 },
                { 1, 3, 3 },
                { 2, 3, 2 },
                { 2, 4, 4 },
                { 3, 4, 1 }
                // Node 5 is isolated or only has outgoing edges
        };

        testShortestPath("DAG with Unreachable Node", N2, M2, edges2, solver);
    }
}

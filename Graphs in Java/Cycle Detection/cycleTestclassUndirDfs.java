import java.util.ArrayList;
public class cycleTestclassUndirDfs {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Edge (1, 2)
        adj.get(1).add(2);
        adj.get(2).add(1);

        // Edge (2, 3)
        adj.get(2).add(3);
        adj.get(3).add(2);

        // Edge (4, 4) - Self-loop
        adj.get(4).add(4); 

        // Edge (1, 4)
        adj.get(1).add(4);
        adj.get(4).add(1);

        // Edge (4, 2)
        adj.get(4).add(2);
        adj.get(2).add(4);

        CycleDetectionDirectedDfs obj = new CycleDetectionDirectedDfs();

        if (obj.isCyclic(V, adj)) {
            System.out.println("Cycle detected!");
        } else {
            print("No cycle detected!");
        }
    }

    private static void print(String message) {
        System.out.println(message);
    }
}

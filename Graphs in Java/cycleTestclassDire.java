import java.util.ArrayList;

public class cycleTestclassDire {
     // ====== TEST CLASS ======
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // example edges (directed graph)
       
        adj.get(1).add(2);
        adj.get(2).add(3);
         adj.get(4).add(4);
        adj.get(1).add(4);
        adj.get(4).add(2);
        

        CycleDetection obj = new CycleDetection();

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

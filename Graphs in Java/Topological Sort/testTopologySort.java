import java.util.ArrayList;
import java.util.Arrays;

public class testTopologySort {
     public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);
        adj.get(3).add(4);

        int[] result = TopoSortDAG.topoSort(V, adj);

        System.out.println("Topological Sort Order:");
        System.out.println(Arrays.toString(result));
    }
}

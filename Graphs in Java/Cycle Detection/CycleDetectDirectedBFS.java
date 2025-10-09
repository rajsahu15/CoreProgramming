//detect a cycle in Directed Graph using BFS (Kahn's Algorithm)
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectDirectedBFS{

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        
        int[] inDegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                inDegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            count++;

            for (int it : adj.get(node)) {
                inDegree[it]--;

                if (inDegree[it] == 0) {
                    q.add(it);
                }
            }
        }

        if (count == V) {
            return false;
        }
        
        return true;
    }
}

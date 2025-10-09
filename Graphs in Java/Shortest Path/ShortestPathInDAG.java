
//Shortest Path in directed Acyclic Graph using topological sorting
import java.util.ArrayList;
import java.util.Stack;

// 1. Helper Class definition (Required by ShortestPathInDAG)
class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

// 2. ShortestPathInDAG implementation (Required by testShortestPath)
class ShortestPathInDAG {

    private void topoSort(int node, ArrayList<ArrayList<Pair>> adj, int[] vis, Stack<Integer> st) {
        vis[node] = 1;
        for (int i = 0; i < adj.get(node).size(); i++) {
            int v = adj.get(node).get(i).first;
            if (vis[v] == 0) {
                topoSort(v, adj, vis, st);
            }
        }
        st.add(node);
    }

    public int[] shortestPath(int N, int M, int[][] edges) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(v, wt));
        }

        int[] vis = new int[N];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < N; i++) {
            if (vis[i] == 0) {
                topoSort(i, adj, vis, st);
            }
        }

        int[] dist = new int[N];
        int INF = (int) 1e9; 
        for (int i = 0; i < N; i++) {
            dist[i] = INF;
        }

        dist[0] = 0;

        while (!st.isEmpty()) {
            int node = st.pop();

            for (int i = 0; i < adj.get(node).size(); i++) {
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;

                if (dist[node] != INF && dist[node] + wt < dist[v]) {
                    dist[v] = dist[node] + wt;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (dist[i] == INF) {
                dist[i] = -1;
            }
        }

        return dist;
    }
}
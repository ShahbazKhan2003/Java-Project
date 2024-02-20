import java.util.*;

public class ShortestPathinUndirectedUnit {
    public static void main(String[] args) {
        int n = 9, m = 10;
        int[][] edges = { { 0, 1 }, { 0, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 1, 2 }, { 2, 6 }, { 6, 7 }, { 7, 8 },
                { 6, 8 } };
        int src = 0;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        int[] dis = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dis[src] = 0;

        while (!q.isEmpty()) {
            int node = q.remove();

            for(int it:adj.get(node)){
                if(dis[node] + 1 <dis[it]){
                    dis[it] = dis[node] +1;
                    q.add(it);
                }
            }    
        }
        for(int i=0;i<n;i++){
            if(dis[i]==Integer.MAX_VALUE) dis[i] = -1;
        }
        System.out.println(Arrays.toString(dis));

    }
}

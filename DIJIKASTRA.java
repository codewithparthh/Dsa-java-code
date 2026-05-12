import java.util.*;

public class DIJIKASTRA {

    static final int V = 6;

    // Function to find the vertex with minimum distance
    static int minDistance(int Distance[], boolean chkVertex[]) {

        int min = Integer.MAX_VALUE;
        int min_index = -1;

        for (int v = 0; v < V; v++) {

            if (chkVertex[v] == false && Distance[v] < min) {

                min = Distance[v];
                min_index = v;
            }
        }

        return min_index;
    }

    
    static void DIJIKASTRA(int graph[][]) {

        int Distance[] = new int[V];
        boolean chkVertex[] = new boolean[V];

        
        for (int i = 0; i < V; i++) {

            Distance[i] = Integer.MAX_VALUE;
            chkVertex[i] = false;
        }

        
        Distance[0] = 0;

        
        for (int count = 0; count < V - 1; count++) {

            int u = minDistance(Distance, chkVertex);

            chkVertex[u] = true;

            for (int v = 0; v < V; v++) {

                if (graph[u][v] != 0 &&
                        chkVertex[v] == false &&
                        Distance[u] != Integer.MAX_VALUE &&
                        Distance[u] + graph[u][v] < Distance[v]) {

                    Distance[v] = Distance[u] + graph[u][v];
                }
            }
        }

        
        System.out.println("Vertex \t Distance from Source");

        for (int i = 0; i < V; i++) {

            System.out.println(i + "\t\t" + Distance[i]);
        }
    }

    public static void main(String[] args) {

        int graph[][] = {
                {0, 4, 5, 0, 0, 0},
                {4, 0, 11, 9, 7, 0},
                {5, 11, 0, 0, 3, 0},
                {0, 9, 0, 0, 13, 2},
                {0, 7, 3, 13, 0, 6},
                {0, 0, 0, 2, 6, 0}
        };

        DIJIKASTRA(graph);
    }
}
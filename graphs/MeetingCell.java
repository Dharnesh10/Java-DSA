import java.util.*;

public class MeetingCell {
    
    // 1. REACHABILITY: Can U reach V?
    public static boolean finReachability(int N, int[] edges, int U, int V) {
        if (U == V) return true; // Already there

        boolean[] visited = new boolean[N];
        int curr = U;
        
        while (curr != -1 && !visited[curr]) {
            if (curr == V) return true; // Found the target node
            visited[curr] = true;
            curr = edges[curr];
        }
        return false;
    }

    // 2. SHORTEST DISTANCE: Number of edges from U to V
    public static int getShortestDistance(int N, int[] edges, int U, int V) {
        if (U == V) return 0;

        int dist = 0;
        boolean[] visited = new boolean[N];
        int curr = U;

        while (curr != -1 && !visited[curr]) {
            if (curr == V) return dist;
            visited[curr] = true;
            curr = edges[curr];
            dist++;
        }
        return -1; // Standard Juspay return for "No Path"
    }

    // 3. NEAREST MEETING CELL: The logic you already wrote
    public static int getNearestMeetingCell(int N, int[] edges, int C1, int C2) {
        long[] dist1 = new long[N];
        long[] dist2 = new long[N];
        Arrays.fill(dist1, -1);
        Arrays.fill(dist2, -1);

        fillDistances(C1, edges, dist1);
        fillDistances(C2, edges, dist2);

        int resultNode = -1;
        long minMaxDist = Long.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (dist1[i] != -1 && dist2[i] != -1) {
                long currentMax = Math.max(dist1[i], dist2[i]);
                if (currentMax < minMaxDist) {
                    minMaxDist = currentMax;
                    resultNode = i;
                }
            }
        }
        return resultNode;
    }

    private static void fillDistances(int startNode, int[] edges, long[] dist) {
        int curr = startNode;
        long d = 0;
        while (curr != -1 && dist[curr] == -1) {
            dist[curr] = d++;
            curr = edges[curr];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            int[] edges = new int[N];
            for (int i = 0; i < N; i++) edges[i] = sc.nextInt();
            
            int C1 = sc.nextInt();
            int C2 = sc.nextInt();

            System.out.println("Nearest Meeting Cell: " + getNearestMeetingCell(N, edges, C1, C2));
            System.out.println("Reachability (C1 to C2): " + finReachability(N, edges, C1, C2));
            System.out.println("Distance (C1 to C2): " + getShortestDistance(N, edges, C1, C2));
        }
        sc.close();
    }
}
import java.util.*;

class AllCellProblemsInGraphs {

    public static int maxWeightNode(int N, int[] edge) {
        long[] weight = new long[N];

        for(int i = 0; i < N; i++) {
            if(edge[i] != -1) {
                weight[edge[i]] += i;
            }
        }

        long maxWeight = -1;
        int maxNode = -1;

        for(int i = 0; i < N; i++) {
            if(weight[i] >= maxWeight) {
                maxWeight = weight[i];
                maxNode = i;
            }
        }
        return maxNode;
    }

    public static int findNearestMeetingCell(int N, int[] edge, int C1, int C2) {
        long[] dist1 = new long[N];
        long[] dist2 = new long[N];
        Arrays.fill(dist1, -1);
        Arrays.fill(dist2, -1);

        fillDistance(C1, edge, dist1);
        fillDistance(C2, edge, dist2);

        int maxNode = -1;
        long maxDist = Long.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            if(dist1[i] != -1 && dist2[i] != -1) {
                long currMax = Math.max(dist1[i], dist2[i]);
                if(currMax < maxDist) {
                    maxDist = currMax;
                    maxNode = i;
                }
            }
        }
        return maxNode;
    }

    public static void fillDistance(int startNode, int[] edge, long[] dist) {
        int curr = startNode;
        long d = 0;
        while(curr != -1 && dist[curr] == -1) {
            dist[curr] = d++;
            curr = edge[curr];
        }
    }

    public static boolean reachability(int N, int[] edge, int U, int V) {
        if(U == V) return true;

        boolean[] visited = new boolean[N];
        int curr = U;

        while(curr != -1 && !visited[curr]) {
            if(curr == V) return true;
            visited[curr] = true;
            curr = edge[curr];
        }
        return false;
    }

    public static int findShortestDistance(int N, int[] edge, int U, int V) {
        if (U == V) return 0;
        boolean[] visited = new boolean[N];
        int curr = U;
        int d = 0;
        while(curr != -1 && !visited[curr]) {
            if(curr == V) return d;
            visited[curr] = true;
            curr = edge[curr];
            d++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int N = sc.nextInt();
            int[] edge = new int[N];

            for(int i = 0; i < N; i++) {
                edge[i] = sc.nextInt();
            }
            int C1 = sc.nextInt();
            int C2 = sc.nextInt();
            System.out.println(maxWeightNode(N, edge));
            System.out.println(findNearestMeetingCell(N, edge, C1, C2));
            System.out.println(reachability(N, edge, C1, C2));
            System.out.println(findShortestDistance(N, edge, C1, C2));
        }
    }
}

import java.util.*;

class MeetingCell {

    public static int findNearestMeetingCell(int N, int[] edge, int C1, int C2) {
        long[] dist1 = new long[N];
        long[] dist2 = new long[N];
        Arrays.fill(dist1, -1);
        Arrays.fill(dist2, -1);

        fillDistances(C1, edge, dist1);
        fillDistances(C2, edge, dist2);

        int resNode = -1;
        long minmaxnode = Long.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            if(dist1[i] != -1 && dist2[i] != -1) {
                long currMax = Math.max(dist1[i], dist2[i]);
                if(currMax < minmaxnode) {
                    minmaxnode = currMax;
                    resNode = i;
                }
            }
        }
        return resNode;
    }

    public static void fillDistances(int startNode, int[] edge, long[] dist) {
        int curr = startNode;
        long d = 0;
        while(curr != -1 && dist[curr] == -1) {
            dist[curr] = d++;
            curr = edge[curr];
        }
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
            System.out.println(findNearestMeetingCell(N, edge, C1, C2));
        } 
    }
}
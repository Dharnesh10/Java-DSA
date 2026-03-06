import java.util.*;

public class MaxCycleSum {
    public static long getLargestSumCycle(int N, int[] Edge) {
        int[] inDegree = new int[N];
        
        // Step 1: Calculate in-degrees
        for (int i = 0; i < N; i++) {
            if (Edge[i] != -1) {
                inDegree[Edge[i]]++;
            }
        }

        // Step 2: Kahn's Algorithm to remove nodes that aren't in cycles
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N];
        
        for (int i = 0; i < N; i++) {
            if (inDegree[i] == 0) {
                visited[i] = true;
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            int next = Edge[curr];
            if (next != -1) {
                inDegree[next]--;
                if (inDegree[next] == 0) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }

        // Step 3: Nodes remaining with inDegree > 0 are part of cycles
        long maxCycleSum = -1;
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                long currentCycleSum = 0;
                int curr = i;
                
                // Traverse this specific cycle
                while (!visited[curr]) {
                    visited[curr] = true;
                    currentCycleSum += curr;
                    curr = Edge[curr];
                }
                maxCycleSum = Math.max(maxCycleSum, currentCycleSum);
            }
        }

        return maxCycleSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            int[] Edge = new int[N];
            for (int i = 0; i < N; i++) {
                Edge[i] = sc.nextInt();
            }
            System.out.println(getLargestSumCycle(N, Edge));
        }
        sc.close();
    }
}
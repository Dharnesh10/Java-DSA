import java.util.*;

class MaxWeightNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            int N = sc.nextInt();
            int[] Edge = new int[N];

            for(int i = 0; i < N; i++) {
                Edge[i] = sc.nextInt();
            }
            System.out.print(findMaxWeightNode(N, Edge));
        }
        sc.close();
    }

    public static int findMaxWeightNode(int N, int[] Edge) {
        long[] weight = new long[N];

        for(int i = 0 ; i < N; i++) {
            if(Edge[i] != -1) {
                weight[Edge[i]] += i;
            }
        }

        int maxNode = -1;
        long maxWeight = -1;

        for(int i = 0; i < N; i++) {
            if(weight[i] >= maxWeight) {
                maxWeight = weight[i];
                maxNode = i;
            }
        }
        return maxNode;
    }
}
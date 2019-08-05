package com.array.test;

import java.util.Arrays;

public class MagicalIndex {

    public static void magicalCountConstantSpace(int[] a) {
        int n = a.length;
        int cnt = 0;
        int INF = (int) 1e9;
        int ptr = 0;
        int temp;

        while (ptr != INF) {
            if (a[ptr] != INF)
                cnt++;

            temp = a[ptr];
            a[ptr] = INF;
            ptr = temp;

            if (ptr == INF)
                break;
        }

        System.out.println(cnt == n);
    }

    public static void magicalCount(int[] A) {
        int n = A.length;
        int i, cnt = 0, j;
        // Array to store parent node of
        // traversal.
        int[] parent = new int[n + 1];

        // Array to determine whether current node
        // is already counted in the cycle.
        int[] vis = new int[n + 1];

        // Initialize the arrays.
        for (i = 0; i < n + 1; i++) {
            parent[i] = -1;
            vis[i] = 0;
        }


        for (i = 0; i < n; i++) {
            j = i;

            // Check if current node is already
            // traversed or not. If node is not
            // traversed yet then parent value
            // will be -1.
            if (parent[j] == -1) {

                // Traverse the graph until an
                // already visited node is not
                // found.
                while (parent[j] == -1) {
                    parent[j] = i;
                    j = (j + A[j] + 1) % n;
                }

                // Check parent value to ensure
                // a cycle is present.
                if (parent[j] == i) {

                    // Count number of nodes in
                    // the cycle.
                    while (vis[j] == 0) {
                        vis[j] = 1;
                        cnt++;
                        j = (j + A[j] + 1) % n;
                    }
                }
            }
        }

        System.out.println(cnt);


    }

    public static void main(String[] args) {

        int[] A = {0, 0, 0, 2};
//        magicalCount(A);
//        magicalCountConstantSpace(A);
        int[] a = {2, 3, 1, 4, 0};

        magicalCountConstantSpace(a);
        a = new int[]{2, 3, 2, 4, 9};
//        magicalCountConstantSpace(a);

    }
}

package org.wars;

import java.util.ArrayList;

public class SequenceSum {
    public static int[] sumOfN(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        for (int i = 0; i <= n; i++) {
            int x = (i * (i + 1)) / 2;
            arr.add(x * sign);
        }

        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
}

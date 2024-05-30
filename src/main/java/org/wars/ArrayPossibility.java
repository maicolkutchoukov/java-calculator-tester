package org.wars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPossibility {

        public static boolean isAllPossibilities(int[] arg) {
            boolean check = false;
            int n = arg.length;
            Set<Integer> mySet = new HashSet<>();
            for (int num : arg){
                mySet.add(num);
            }
            for (int i = 0; i < n; i++) {
                if (!mySet.contains(i)) {
                    return false;
                }
            }
            return true;
        }

}

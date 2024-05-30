package org.wars;

import java.util.Arrays;

public class Kata {
    public static boolean isAnagram(String test, String original) {
        String t = test.toLowerCase();
        String o = original.toLowerCase();
        char[] tArr = t.toCharArray();
        char[] oArr = o.toCharArray();
        char[] pArr = test.toLowerCase().toCharArray();
        Arrays.sort(tArr);
        Arrays.sort(oArr);
        return Arrays.equals(tArr, oArr);
    }
}

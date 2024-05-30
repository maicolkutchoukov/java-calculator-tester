package org.wars;

import java.util.Arrays;
import java.util.Locale;

public class MaxValue
    {
        public static boolean getXO (String str) {
            int countO = 0;
            int countX = 0;
            String s = str.toLowerCase();
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == 'o'){
                    countO++;
                } else if (s.charAt(i) == 'x') {
                    countX++;
                }
            }
            return countX == countO;
        }
    }


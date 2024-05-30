package org.wars;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hh = 0;
        int mm = 0;
        int ss = 0;

        if (seconds >= 3600) {
            hh = seconds / 3600;
            seconds %= 3600;
        }

        if (seconds >= 60) {
            mm = seconds / 60;
            seconds %= 60;
        }

        ss = seconds;

        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }

    public static void main(String[] args) {
        System.out.println(HumanReadableTime.makeReadable(60));
    }
}
package org.wars;

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {

        String[] phrases = {
                "I love you",
                "a little",
                "a lot",
                "passionately",
                "madly",
                "not at all"
        };

        int index = (nb_petals - 1) % phrases.length;
        return phrases[index];
    }

    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(50));
        System.out.println(13%5);
    }
}

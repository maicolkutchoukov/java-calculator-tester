package org.wars;

public class CookingTime
{
    public static String getTime(String neededPower, int minutes, int seconds, String power) {
        // Rimuovi tutti i caratteri non numerici
        int neededPowerInt = Integer.parseInt(neededPower.replaceAll("\\D", ""));
        int myPower = Integer.parseInt(power.replaceAll("\\D", ""));

        // Calcola il totale dei secondi dal tempo dato
        int totalSeconds = minutes * 60 + seconds;

        // Calcola il nuovo tempo proporzionale
        double totalTime = totalSeconds * ((double)neededPowerInt / myPower);

        // Arrotonda il tempo in alto
        int roundedTime = (int)Math.ceil(totalTime);

        // Calcola i minuti e i secondi
        int myMinutes = roundedTime / 60;
        int mySeconds = roundedTime % 60;

        // Costruisci il risultato formattato
        return myMinutes + " minutes " + mySeconds + " seconds";
    }

    public static void main(String[] args) {
        System.out.println(CookingTime.getTime("600W", 4, 20, "800W"));
    }
}

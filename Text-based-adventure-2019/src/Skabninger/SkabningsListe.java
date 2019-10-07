/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 06/10/2019
 */

package Skabninger;

import java.util.ArrayList;

public class SkabningsListe {

    private static ArrayList<SkabningsPrototype> alleSkabninger = new ArrayList<>();

    public static String tilfojSkabning(SkabningsPrototype creature) {
        alleSkabninger.add(creature);
        return creature.navn + " tilføjet  til skabningslisten.";
    }

    public static SkabningsPrototype hentSkabning(int tal) {
        return alleSkabninger.get(tal-1);
    }

    public static String listSkabninger() {
        int nummer = 0;
        String resultat = "";
        for (SkabningsPrototype skabning : alleSkabninger) {
            resultat+= ++nummer + ". " + skabning.navn + "\n";
        }
        return resultat;
    }

}

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 06/10/2019
 */

package Skabninger;

import java.util.HashMap;

public abstract class SkabningsPrototype {

    public String navn;
    public String beskrivelse; // En hel sætning, starter med stort og slutter med punktum
    public double vaegt; // Kg
    public HashMap<String, String> kanSnakkeOm = new HashMap<>(); // Emne med et ord, forklaring i en hel sætning, f.eks. "kongen" --> "Kongen bor på slottet."

    public SkabningsPrototype() {
        SkabningsListe.tilfojSkabning(this);
    }

    /** Skabningen hilser (returnerer String )*/
    public String sigerHej() {
        String besked =  "Hej rejsende! Mit navn er " + navn + ". " + beskrivelse + " Jeg vejer " + vaegt + "kg. ";
        if (!kanSnakkeOm.isEmpty()) {besked += "Jeg kan snakke om " + kanSnakkeOmEmner()  + ".";}
        return besked;
    }

    /** Skabningen kan snakke om disse emner (returnerer String) */
    public String kanSnakkeOmEmner() {

        return String.join(", ", kanSnakkeOm.keySet());
    }

    /** Skabningen kan lære en saetning om et emne, returnere OK, hvis sætning er lært */
    public String laerNytEmne(String emne, String saetning) {
        kanSnakkeOm.put(emne, saetning);
        return "OK";
    }

    public String sigeNogetOm(String emne) {
        return navn + " siger: " + kanSnakkeOm.get(emne);
    }

}

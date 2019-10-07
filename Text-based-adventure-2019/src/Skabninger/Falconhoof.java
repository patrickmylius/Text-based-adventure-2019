package Skabninger;

public class Falconhoof extends SkabningsPrototype {
    public Falconhoof() {
        super();
        this.navn = "Falconhoof";
        this.beskrivelse = "Host of Limmy's Show.";
        this.vaegt = 90;

        laerNytEmne("KillJester", "you can't kill jester, jester is our friend!");
        laerNytEmne("Left", "you can't go lef- what do yo- what do you mean with left? there is no left!?");
        laerNytEmne("Iwannagoleft", "There is a castle infront of you, there is no LEFT!!!");
        laerNytEmne("Itsmyadventureright", "Jester is INTEGRAL to our journey!!");
        laerNytEmne("KilltheJester", "Fine. Jester is dead, you can now continue on your adventure");
        laerNytEmne("NiceOneMate, well worth it", "*Confusion*");
    }
}

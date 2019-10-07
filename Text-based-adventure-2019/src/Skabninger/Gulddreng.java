package Skabninger;

public class Gulddreng extends SkabningsPrototype{

    public Gulddreng() {
        super();
        this.navn = "Gulddreng";
        this.beskrivelse = "Har det for fedt! Livet er nemt.";
        this.vaegt = 80;

        laerNytEmne("Java", "Gulddreng approves");
        laerNytEmne("Politik", "Gulddreng approves");
        laerNytEmne("Kajak", "Gulddreng approves");
        laerNytEmne("Skyld", "Gulddreng skylder aldrig");



    }

}

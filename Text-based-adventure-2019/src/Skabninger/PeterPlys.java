package Skabninger;

public class PeterPlys extends SkabningsPrototype {

    public PeterPlys() {
        super();
        this.navn = "Peter Plys";
        this.beskrivelse = "Honning er mit drug";
        this.vaegt = 150;

        laerNytEmne("honning", "Lever af honning, intet andet og jeg er dybt afhængig.");
        laerNytEmne("bolig", "Jeg bor i et træ.");
        laerNytEmne("venner", "Tigerdyret er en god kammersjuk, ligesom Grisling.");
    }

}

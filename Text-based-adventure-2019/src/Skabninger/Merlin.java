package Skabninger;

public class Merlin extends SkabningsPrototype {

    public Merlin() {
        super();
        this.navn = "Merlin";
        this.beskrivelse = "Vis, rådgivningsvillig og distræt troldmand.";
        this.vaegt = 75;

        laerNytEmne("Arthur", "Arhh, Arthur er sådan en herlig lærling, lidt sløv i betrækket, men jeg er sikker på han nok skal nå langt.");
        laerNytEmne("Dilemma", "Ja, ja, det kan jeg godt se. Prøv Mads & Monopolet.");
        laerNytEmne("Mimi", "Tal ikke om hende. Frygtelig heks. Flygt, hvis du ser hende.");
        laerNytEmne("Et god råd", "Te. Der er ikke noget, en kop te ikke kan klare.");
    }
}
package Skabninger;

public class Tommy extends SkabningsPrototype {

    public Tommy() {
        super();
        this.navn = "TOMMY!";
        this.beskrivelse = "Lidt uhyggelig men stadig meget sød";
        this.vaegt = 350;

        laerNytEmne("Livrret", "Pizza med flødeskum");
        laerNytEmne("Sport", "Det kan jeg fandme ikke lide!");
        laerNytEmne("Hobby", "Skræmme små børn!");
        laerNytEmne("Skuespiller", "Tom Cruise, han er lidt lækker :i");
    }
}

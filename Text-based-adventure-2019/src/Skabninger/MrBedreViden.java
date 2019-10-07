package Skabninger;

public class MrBedreViden extends SkabningsPrototype {

    public MrBedreViden() {
        super();
        this.navn = "MrBedreViden";
        this.beskrivelse = "Ung I krop, gammel i sind ";
        this.vaegt = 100;

        laerNytEmne("fotoshop" , "Den korrekte betegnelse er Photoshop, dit fjols. Photoshop er et program til design redigering");
        laerNytEmne("vægttab" , "Der skal mere ud, end der puttes ind, logisk og særdeles simpelt.");
        laerNytEmne("muskelopbygning" , "Du bliver hvad du spiser, så hvis målet er at blive en bøf, spis bøf, logic.");
        laerNytEmne("good2know" , "Hvis du banker dit hoved ind i væggen bruger du 150 kalorier i timen, GG.");
    }
}
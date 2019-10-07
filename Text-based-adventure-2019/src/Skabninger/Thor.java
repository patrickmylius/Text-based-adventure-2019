package Skabninger;

public class Thor extends SkabningsPrototype {

    public Thor() {
        super();
        this.navn = "Thor";
        this.beskrivelse = "Nordisk Gud";

        laerNytEmne("java", "Java er sjovt, synes jeg!");
        laerNytEmne("Rival", "Loke er min ærkefjende ");
        laerNytEmne("Nordisk_gud", "Jeg er en nordisk gud, søn af Odin.");
        laerNytEmne("Krafter", "Jeg behersker torden!");
    }
}

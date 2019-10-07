package Skabninger;

public class Rick extends SkabningsPrototype {

    public Rick() {
        super();
        this.navn = "Rick";
        this.beskrivelse = "Dranker, meget klog";
        this.vaegt = 110;

        laerNytEmne("Bajer", "Jeg hader Dansk Pilsner");
        laerNytEmne("Politik", "Jeg hader Stram  Kurs");
        laerNytEmne("Musik", "Jeg håber at Kanye snart dropper Jesus is King");
        laerNytEmne("Reddit", "Jeg elsker r/programmerhumor ");

    }
}

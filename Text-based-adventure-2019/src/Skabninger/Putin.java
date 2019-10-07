package Skabninger;

public class Putin extends SkabningsPrototype {
    public Putin(){
        super();
        this.navn = "Vladimir Putin";
        this.beskrivelse = "Velkommen til moderlandet Rusland";
        this.vaegt = 70;

        laerNytEmne("ukraine", "lad os glemme at det skete :D");
        laerNytEmne("hej", "привет");
        laerNytEmne("økonomi", "pls fortæl EU at ophæve deres sanktioner");
        laerNytEmne("USA", "lad os lægge den kolde krig bag og og blive venner <3");
        laerNytEmne("demokrati", "Alle kandidater har samme mulighed for at vinde. Hvis du tænker anderledes, så er der lige kommet en ledig plads i gulaggen :)");
    }
}
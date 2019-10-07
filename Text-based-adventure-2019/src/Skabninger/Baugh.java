package Skabninger;

public class Baugh extends SkabningsPrototype {

    public Baugh() {
        super();
        this.navn = "Baugh";
        this.beskrivelse = "En meget stor og stærk orc, men han tænker ikke så meget før han handler.";
        this.vaegt = 90;

        laerNytEmne("hobby", "Krig er livet, jeg kan ikke bare side stille som menneskerne!");
        laerNytEmne("politik", "Jeg er ikke glad for at snakke, lad os bare kæmpe om det, ellers så kan du snakke med min leder.");
        laerNytEmne("leder", "Jeg er meget glad for min leder, han sender mig i mange krige, så jeg kan beskytte min civilisation.");
        laerNytEmne("borgere", "Vi beskytter vores borgere som sørger for at leve deres liv uden krig.");
        laerNytEmne("andet", "Når jeg ikke kæmper så drikker jeg med de andre krigere.");
    }
}

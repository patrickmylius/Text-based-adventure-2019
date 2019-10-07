package Skabninger;

public class Kaffe extends SkabningsPrototype{

    public Kaffe() {
        super();
        this.navn = "Kaffe";
        this.beskrivelse = "dejligt at drikke, mens man koder";
        this.vaegt = 1;

        laerNytEmne("Kaffe", "\tkaffe er godt om morgene\n");
        laerNytEmne("koffein", ",\thar den samme byggeklods som adenosin(træthedsskabende), så koffein blokere den\n" );
        laerNytEmne("Adenosin", "\tAdenosin udløser træthedssignaler og fortæller kroppen, når vi har brug for søvn og hvile\n "+
                "\tKoffein blokerer denne mekanisme og blokerer dermed også vores træthedsfornemmelse\n");


    }
}

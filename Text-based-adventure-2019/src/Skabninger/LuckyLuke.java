package Skabninger;

public class LuckyLuke extends SkabningsPrototype {

    public LuckyLuke() {
        super();
        this.navn = "Lucky Luke";
        this.beskrivelse = "Den hurtigste skiderik i alle vesten mørke kroge.";
        this.vaegt = 67;

        laerNytEmne("Våben", "Mine pistoler er mit foretrukne redskab, men mine næver er heller ikke til at spøge med.");
        laerNytEmne("Hest", "Jolly Roger er navnet på min hest. Han har telefontider alle hverdage mellem 10-15");
        laerNytEmne("Fjender", "Mine værste fjender er gluten-allergi og dernæst Dalton-brødrene.");
        laerNytEmne("Politik", "Politik siger mig ingenting. Så længe jeg har en dåse bønner og noget tobak, så er jeg en glad cowboy");
    }
}

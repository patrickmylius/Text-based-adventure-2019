package Skabninger;

public class Hund extends SkabningsPrototype {
    public Hund() {
        super();
        this.navn = "Hund";
        this.beskrivelse = "En sort labrador.";
        this.vaegt = 30;

        laerNytEmne("opvækst", "Vov vov vov.... vov. Vov vov!");
        laerNytEmne("knogler", "VOV VOVOVO V OVVO VO VOVVO VOV!!!");
        laerNytEmne("osmose", "Osmose er diffusion over en semi-permeabel celle-membran.");
        laerNytEmne("hobbyer", "Vov? Voooov vov vov vov vov. Vov! Vov. Vov vov vov.");
    }
}

package Spillepladen;

import java.util.ArrayList;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 06/10/2019
 */

public class SpilleFelt {

    public String beskrivelse;
    public String lokationsType;
    public int bredde; // meter
    public int laengde; // meter
    public ArrayList<Genstand> genstande = new ArrayList<Genstand>();

    public String beskriv() {
        return "";
    }

    public int hvorStortiKvm() {
        return 0;
    }

    public String hvorStort() {
        return "";
    }

    public String listGenstande() {
        return "";
    }

    public String getLokationsType() {
        return lokationsType;
    }

    public void setLokationsType(String lokationsType) {
        this.lokationsType = lokationsType;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public int getBredde() {
        return bredde;
    }

    public void setBredde(int bredde) {
        this.bredde = bredde;
    }

    public int getLaengde() {
        return laengde;
    }

    public void setLaengde(int laengde) {
        this.laengde = laengde;
    }

    public ArrayList<Genstand> getGenstande() {
        return genstande;
    }

    public void setGenstande(ArrayList<Genstand> genstande) {
        this.genstande = genstande;
    }
}

package Skabninger;

public class KelvinTamer extends SkabningsPrototype {

    public KelvinTamer() {
        super();
        this.navn = "Kelvin Tamer";
        this.beskrivelse = "Jeg kommer fra en planet kaldet Ungoloid. Mit folk overlever ved hjælp af energi fra nogle sjældne skabninger," +
                " som kaldes kelvins, men de er nær udryddelse på min planet. De sidste få kelvins vi har tilbage," +
                " er vi nødt til at holde i fangeskab og tvinge dem til at have sex med sig selv. Jeg har hørt, at der findes nogle af de sjældne" +
                " kelvins her på jorden, så derfor er jeg ankommet til jorden for at indfange dem og tage dem med tilbage, så de kan redde mit folk" +
                " fra udryddelse. Gotta catch 'em all!";
        this.vaegt = 9001;

        laerNytEmne("Kelvinfakta", "Kelvins kommer i mange forskellige afskyginger, men fælles for dem er som regel: lav IQ," +
                "dårlig humor, svag angrebsstyrke, giga gay (det er mere end mega)");
        laerNytEmne("Kelvin jokes", "Hvor mange kelvins skal der til at koge et æg? ...273");
        laerNytEmne("Din vægt", "Jeg er ikke tyk! Grundstofdensiteten på min planet er bare meget højere end på jorden, okay?");
        laerNytEmne("Kelvinjagt", "Det er endnu ikke lykkes mig at fange den, men jeg er på sporet af en af de sjældne kelvins" +
                " lige her i Næstved! Har du nogen idé om, hvor den kan opholde sig?");
    }

}
/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 06/10/2019
 */
package Skabninger;

public class Andras extends SkabningsPrototype {

    public Andras() {
        super();
        
        this.navn = "András";
        this.beskrivelse = "Lidt nørdet, men meget geek.";
        this.vaegt = 75;

        laerNytEmne("java", "Java er sjovt, synes jeg!");
        laerNytEmne("politik", "Jeg er meget glad for Greta Thunbergs klimabevægelse.");
        laerNytEmne("kajak", "Kajakpolo er det fedeste sport, synes jeg.");
        laerNytEmne("skyld", "Jeg skylder vist en bajer til Kelvin endnu.");
    }

}

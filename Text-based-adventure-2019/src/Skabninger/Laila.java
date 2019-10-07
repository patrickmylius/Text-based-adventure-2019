/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 06/10/2019
 */
package Skabninger;

public class Laila extends SkabningsPrototype {

    public Laila() {
        super();
        this.navn = "Shadowdancer";
        this.beskrivelse = "A new shiny day with great adventures.";
        this.vaegt = 59;

        laerNytEmne("yoga", "Yoga er skønt for kroppen efter en lang dag med quest!");
        laerNytEmne("skattekort", "Jeg har fundet et skattekort som bliver min næste quest.");
        laerNytEmne("Where do you want to go next", "Take this map");
        laerNytEmne("Enemy", "There are several types of enemies. Be aware of the shadows");
    }

}

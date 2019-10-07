package Skabninger;

public class Katten_Otto extends SkabningsPrototype {

        public Katten_Otto() {
            super();
            this.navn = "Katten Otto";
            this.beskrivelse = "Det en kat, som hedder Otto";
            this.vaegt = 5;

            laerNytEmne("java", "Meow");
            laerNytEmne("politik", "MEOW MEOW MEOW MEOW!");
            laerNytEmne("kajak", "...");
            laerNytEmne("skyld", "MEOW! *Skubber til madskål*");
        }
}

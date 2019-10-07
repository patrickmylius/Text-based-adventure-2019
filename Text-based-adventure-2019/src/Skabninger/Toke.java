/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 06/10/2019
 */
package Skabninger;

public class Toke extends SkabningsPrototype {

    public Toke() {
        super();
        this.navn = "Toke";
        this.beskrivelse = "Meget nørdet, og overdreven geek.";
        this.vaegt = 0;

        laerNytEmne("java", "Java er OK, men PHP er sjovere!");
        laerNytEmne("politik", "Politiker forstår ikke IT, og de burde holde sig noget de ikke forstår");
        laerNytEmne("linux", "Linux er pt. det bedste OS");
    }

}

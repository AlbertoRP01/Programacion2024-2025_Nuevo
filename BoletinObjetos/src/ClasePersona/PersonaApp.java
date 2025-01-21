package ClasePersona;

import java.time.LocalDate;

public class PersonaApp {
    public static void main(String[] args) {
        Persona persona = new Persona("Paco", LocalDate.of(2001, 10, 12),29623195,'M',1.61f,82.50f);
        System.out.println(persona.toString());
    }
}

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

import static java.time.LocalDate.now;
import static java.time.chrono.ChronoLocalDate.timeLineOrder;


public class Persona {

    private String nombre;
    private int dni;
    private LocalDate fecha;
    String sexo;
    float altura;
    float peso;
    String letraDni;

    public Persona(String nombre, int dni, String sexo, float altura, float peso, String letraDni, int year, int month, int day) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.letraDni = letraDni;
        this.fecha = LocalDate.of(year, month, day);
    }

    public String getNombre() {
        return nombre;
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        if (dni.le >)
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws PersonaException {
        if (altura < 0) {
            throw new PersonaException("no puedes introducir un numero negativo");
        }
        this.altura = altura;
    }

    public float getPeso() {

        return peso;
    }

    public void setPeso(float peso) throws PersonaException {
        if (peso < 0) {
            throw new PersonaException("No puedes introducir un numero negativo");
        }
        this.peso = peso;
    }

    public void setFecha(LocalDate fecha) throws PersonaException {
        if (this.fecha.isAfter(LocalDate.now())) {
            throw new PersonaException("Error ha superado la fecha actual");
        }
        if (LocalDate.now().minus(100).isAfter(this.fecha)){

        }
    }

    public float getIMC(float peso, float altura) {

    }
}

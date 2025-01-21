package ClasePersona;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    LocalDate fechaNac;
    int dni;
    char sexo;
    float altura;
    float peso;

    public Persona(String nombre, LocalDate fechaNac, int dni, char sexo, float altura, float peso) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }


    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public char getLetraDni() {
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letra[dni % 23];
    }

    public int getEdad() {
        return LocalDate.now().getYear() - fechaNac.getYear();
    }

    public float getIMC() throws PersonaException {
        if (altura <= 0) {
            throw new PersonaException("La altura debe ser mayor que 0");
        }
        return peso / (altura * altura);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNac=" + fechaNac +
                ", dni=" + dni + getLetraDni() +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}

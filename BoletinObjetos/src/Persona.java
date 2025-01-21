import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNac;
    private int dni;
    private String sexo;
    private float Altura;
    private float peso;
    private char letraDNI;


    public Persona(String nombre, int dni, String sexo, char letraDNI) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.letraDNI = letraDNI;
        this.fechaNac = LocalDate.of(2001, 10, 12);
    }

    public int getDNI() {

        return dni;
    }

    public String getSexo() {

        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getLetraDNI() {
        return letraDNI;
    }

    public char getLetraDni() {
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letra[dni % 23];
    }
}

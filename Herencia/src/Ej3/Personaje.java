package Ej3;

public abstract class Personaje {

    // CONSTANTES

    private final int FUERZA_MAX = 20;
    private final int FUERZA_MIN = 0;
    private final int INTELIGENCIA_MAX = 20;
    private final int INTELIGENCIA_MIN = 0;
    private final int VIDA_MAX = 100;
    private final int VIDA_MIN = 0;

    //ATRIBUTOS

    private String nombre;
    private TipoRaza raza;
    private int fuerza;
    private int inteligencia;
    private int vida;

    //CONSTRUCTOR

    public Personaje(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vida) throws PersonajeException {
        this.nombre = nombre;
        this.raza = raza;
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setVida(vida);
    }
    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public TipoRaza getRaza() {
        return raza;
    }

    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getVIDA_MAX() {
        return VIDA_MAX;
    }

    public int getVIDA_MIN() {
        return VIDA_MIN;
    }


    /**
     * INTRODUCIMOS UN TOPE SOBRE LA INTELIGENCIA PARA QUE NO SOBREPASE POR DEBAJO NI SUPERE A LA INTELIGENCIA BASE
     */

    protected void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < INTELIGENCIA_MIN || inteligencia > INTELIGENCIA_MAX) {
            throw new PersonajeException("El valor de inteligencia no es correcto");

        }
        this.inteligencia = inteligencia;
    }

    /**
     * INTRODUCIMOS UN TOPE SOBRE LA FUERZA PARA QUE NO SOBREPASE POR DEBAJE DE LA FUERZA  NI SUPERE A LA FUERZA BASE
     *
     * @param fuerza
     * @throws PersonajeException
     */
    protected void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza < FUERZA_MIN || fuerza > FUERZA_MAX) {
            throw new PersonajeException("El valor de  fuerza no es correcto");
        }
        this.fuerza = fuerza;
    }

    /**
     * INTRODUCIMOS UN TOPE SOBRE LA FUERZA PARA QUE NO SOBREPASE POR DEBAJE DE LA FUERZA  NI SUPERE A LA VIDA BASE
     *
     * @param vida
     * @throws PersonajeException
     */

   protected void setVida(int vida) throws PersonajeException {
        if (vida < VIDA_MIN || vida > VIDA_MAX) {
            throw new PersonajeException("El valor de vida no es correcto");
        }
        this.vida = vida;
    }

    @Override
    public String toString() {
        return ("El nombre es: %s\n" +
                "La raza es: %s\n" +
                "La fuerza vale: %d\n" +
                "La inteligencia vale %d\n" +
                "La vida vale %d \n").formatted(nombre, raza, fuerza, inteligencia, vida);
    }
}


package Ej3;

public class Clerigo extends Personaje {
    private static final int CANTIDAD_CURA = 10;
    private String dios;

    public Clerigo(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vida, String dios) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, vida);
        this.dios = dios;
        setFuerza(fuerza);
        setInteligencia(inteligencia);
    }

    protected void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza < 18) {
            throw new PersonajeException("El valor de  fuerza no es correcto");
        }
        super.setFuerza(fuerza);
    }

    protected void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < 12 || inteligencia > 16) {
            throw new PersonajeException("El valor de inteligencia no es correcto");

        }
        super.setInteligencia(inteligencia);
    }

    /**
     *
     * @param personaje
     * @throws PersonajeException
     */
    public void curar(Personaje personaje) throws PersonajeException {
        boolean tiene = true;

        if (this.getNombre().equals(personaje.getNombre())) {
            throw new PersonajeException("No puedes  curarte a ti mismo");
        }
        if ((personaje.getVida() + CANTIDAD_CURA) > personaje.getVIDA_MAX()) {
            personaje.setVida(personaje.getVIDA_MAX());
        }else {
           personaje.setVida(personaje.getVida() + CANTIDAD_CURA);


        }


    }

    @Override
    public String toString() {
        return super.toString()+"El dios al que venera es %s".formatted(dios);
    }
}

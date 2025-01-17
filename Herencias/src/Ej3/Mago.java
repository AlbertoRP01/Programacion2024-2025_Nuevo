package Ej3;

public class Mago extends Personaje {

    //ATRIBUTOS

    private String[] hechizos;

    //CONSTRUCTOR

    public Mago(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vida) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, vida);
        this.hechizos = new String[4];
        setFuerza(fuerza);
        setInteligencia(inteligencia);
    }

    /**
     * SI LA INTELIGENCIA ES MENOR QUE LOS PUNTOS DE INTELIGENCIA ESTO HACE QUE YO CREE UNA EXCEPCION EN LA CUAL
     * EL MAGO TENGA INTELIGENCIA DE BASE ES DE 17 HASTA LO QUE QUIERAS
     *
     * @param inteligencia
     * @throws PersonajeException
     */


    protected void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < 17) {
            throw new PersonajeException("El valor de inteligencia no es correcto");

        }
        super.setInteligencia(inteligencia);

    }


    /**
     * SI LA FUERZA SUPERA A LOS PUNTOS DE FUERZA BASE NOS MUESTRA UNA EXCEPCION EN LA CUAL ESE VALOR NO SEA CORRECTO.
     * POR LO TANTO HACEMOS QUE LA FUERZA COMO MAXIMO SON 15 DE FUERZA LO QUE PUEDE TENER UN MAGO
     *
     * @param fuerza
     * @throws PersonajeException
     */

    protected void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza > 15) {
            throw new PersonajeException("El valor de  fuerza no es correcto");
        }
        super.setFuerza(fuerza);
    }

    /**
     * EN ESTE METODO LO QUE HACEMOS ES COMPROBAR SI HAY HUECO EN EL ARRAY PUES PUEDE AÑADIR EL HECHIZO EN ESE ESPACIO
     * EN EL CASO DE QUE NO INTRODUCIMOS UNA EXCEPCION QUE MUESTRA UN MENSAJE QUE ESTÁ LLENO
     *
     * @param hechizo
     * @throws PersonajeException
     */

    public void addHechizo(String hechizo) throws PersonajeException {
        boolean esta = false;
        for (int i = 0; i < hechizos.length && !esta; i++) {
            if (hechizos[i] == null) {
                hechizos[i] = hechizo;
                esta = true;
            }

        }
        if (!esta) {
            throw new PersonajeException("No hay mas huecos de hechizos");
        }

    }

    /**
     * ESTE METODO SE BASA EN  QUE NO PUEDES LANZAR HECHIZO A TI MISMO, HE CREADO UN  ARRAY PARA QUE REPASE LOS HECHIZOS
     * QUE HAY EN EL ARRAYM, TAMBIEN EN EL CASO DE QUE LANZES EL HECHIZO AL ENEMIGO PUES LE QUITA 10 DE VIDA.
     * POR ULTIMO UNA VEZ UTILIZADO ESE HECHIZO SERA BORRADO DE DICHO ARRAY
     *
     * @param hechizo
     * @param personaje
     * @throws PersonajeException
     */
    public void lanzarHechizo(String hechizo, Personaje personaje) throws PersonajeException {
        int restarVida = 10;
        boolean siHay = false;
        if (this.getNombre().equals(personaje.getNombre())) {
            throw new PersonajeException("No puedes lanzar hechizo a ti mismo");
        }
        for (int i = 0; i < hechizos.length; i++) {

            if (hechizo.equals(hechizos[i])) {
                siHay = true;
                hechizos[i] = null;
            }
        }
        if (siHay) {
            personaje.setVida(personaje.getVida() - restarVida );


        } else {
            if (personaje.getVida() == 0) {
                System.out.println(" LA victima ha muerto");
            }


        }
        if (!siHay) {
            throw new PersonajeException("No se encuentra el hechizo");
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("La lista de hechizos de este mago es:\n");
        for (int i = 0; i < hechizos.length; i++) {
            if(hechizos[i]!=null){
                sb.append("Hechizo %d es, %s\n".formatted(i+1,hechizos[i]));
            }else{
                sb.append("El espacio %d esta libre para un nuevo hechizo \n".formatted(i+1));
            }
        }
        return sb.toString();
    }
}

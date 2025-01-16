package Ej2;

/**
 * INTRODUCIMOS SUS GAMAS CON SUS PRECIOS
 */
public enum TGama {
    //TIPOS
    BAJA(30), MEDIA(40), ALTA(50);

    //ATRIBUTOS
    private final int precioBase;

    /**
     * CREAMOS UN CONSTRUCTOR LA PRECIO BASE PARA  QUE PODAMOS CREAR NUESTRO GET PRECIO BASE PARA SUS FUTURAS OPERACIONES
     *
     * @param precioBase
     */
    TGama(int precioBase) {
        this.precioBase = precioBase;
    }
    //GETTERS
    public int getPrecioBase() {
        return precioBase;
    }

}

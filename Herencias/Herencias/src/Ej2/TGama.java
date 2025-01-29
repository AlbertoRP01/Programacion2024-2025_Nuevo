package Ej2;

public enum TGama {
    BAJA  (30),MEDIA  (40), ALTA  (50);

    private final int  precioBase;

    TGama(int precioBase) {
        this.precioBase = precioBase;
    }
}

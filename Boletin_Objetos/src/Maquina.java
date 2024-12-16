import java.util.IllegalFormatCodePointException;

public class Maquina {
    //CONSTANTES
    private static final int MAX_DEPOSITO_CAFE = 50;
    private static final int MAX_DEPOSITO_LECHE = 50;
    private static final int MAX_DEPOSITO_VASOS = 80;
    private static final float PRECIO_LECHE = 0.80f;
    private static final float PRECIO_CAFE = 1.00f;
    private static final float PRECIO_CAFE_LECHE = 1.50f;

    //Atributos

    private int depositoCafe;
    private int depositoLeche;
    private int depositoVasos;
    private float monedero;

    //Constructor maquina cafe con sus depositos

    public Maquina(float monedero) throws MaquinaCafeException {
        if (monedero < 0) {
            throw new MaquinaCafeException("No negativo");
        }

        rellenarDepositos();
    }


    public void rellenarDepositos() {
        depositoCafe = MAX_DEPOSITO_CAFE;
        depositoLeche = MAX_DEPOSITO_LECHE;
        depositoVasos = MAX_DEPOSITO_VASOS;
    }

    public double servirCafe(double dineroIntroducido) throws MaquinaCafeException {
        if (dineroIntroducido < PRECIO_CAFE) {
            throw new MaquinaCafeException("El importe introducido no es correcto");
        }
        if (dineroIntroducido - PRECIO_CAFE > monedero) {
            throw new MaquinaCafeException("Cambio no disponibkle para ese importe");
        }
        monedero += PRECIO_CAFE;
        depositoCafe--;
        depositoVasos--;
        return dineroIntroducido - PRECIO_CAFE;

    }

    public double ServirLeche(double dineroIntroducido) throws MaquinaCafeException {
        if (dineroIntroducido < PRECIO_LECHE) {
            throw new MaquinaCafeException("El import introducido no es correcto");

        }
        if (dineroIntroducido - PRECIO_LECHE > monedero) {
            throw new MaquinaCafeException("Cambio no disponible para ese importe");

        }
        monedero += PRECIO_LECHE;
        depositoLeche--;
        depositoVasos--;
        return dineroIntroducido - PRECIO_CAFE_LECHE;
    }

    public double ServirCafeLeche(double dineroIntroducido) throws MaquinaCafeException{
        if (dineroIntroducido < PRECIO_CAFE_LECHE){
            throw new MaquinaCafeException("El importe introducido no es correcto");
        }
        if (dineroIntroducido - PRECIO_CAFE_LECHE > monedero){
            throw  new MaquinaCafeException("Cambio no disponible para ese importe");
        }
        monedero += PRECIO_CAFE_LECHE;
        depositoLeche--;
        depositoCafe--;
        depositoVasos--;
        return dineroIntroducido - PRECIO_CAFE_LECHE;
    }
    public static double controlarDinero(int opcion){
        double dineroIntroducido = MiEntradaSalida.solicitar("Introduce el dinero");


    }
}

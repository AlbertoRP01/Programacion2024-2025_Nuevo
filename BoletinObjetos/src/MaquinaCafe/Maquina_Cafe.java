package MaquinaCafe;

import java.util.Scanner;

public class Maquina_Cafe {
    public static Scanner sc = new Scanner(System.in);
    //CONSTANTES
    private final int MAX_DEPOSITO_CAFE = 50;
    private final int MAX_DEPOSITO_LECHE = 50;
    private final int MAX_DEPOSITO_VASOS = 80;
    private final double MAX_PRECIO_CAFE = 1.0;
    private static final double MAX_PRECIO_LECHE = 0.8;
    private static final double MAX_PRECIO_CAFE_LECHE = 1.5;

    //ATRIBUTOS
    private int dosis_cafe;
    private int dosis_leche;
    private int vasos;
    private double monedero;

    public int getDosis_cafe() {
        return dosis_cafe;
    }

    public int getDosis_leche() {
        return dosis_leche;
    }

    public int getVasos() {
        return vasos;
    }

    public double getMonedero() {
        return monedero;
    }

    public void setDosis_cafe(int dosis_cafe) {
        this.dosis_cafe = dosis_cafe;
    }


    public Maquina_Cafe(int dosis_cafe, int dosis_leche, int dosis_cafe_leche, int vasos) {
        this.dosis_cafe = MAX_DEPOSITO_CAFE;
        this.dosis_leche = MAX_DEPOSITO_LECHE;
        this.vasos = MAX_DEPOSITO_VASOS;
        this.monedero = 500;
    }



    public void llenarDepositos() throws Maquina_Cafe_Exception {
        if (dosis_cafe >= MAX_DEPOSITO_CAFE && dosis_leche >= MAX_DEPOSITO_LECHE && vasos >= MAX_DEPOSITO_VASOS) {
            throw new Maquina_Cafe_Exception("Los depositos estan llenos");
        } else {
            dosis_leche = MAX_DEPOSITO_LECHE;
            dosis_cafe = MAX_DEPOSITO_CAFE;
            vasos = MAX_DEPOSITO_VASOS;
        }
    }

    public double servirCafe() throws Maquina_Cafe_Exception {
        System.out.println("Introduce el dinero de la maquina");
        double dinero = sc.nextDouble();
        if (dinero > MAX_PRECIO_CAFE) {

            dinero -= MAX_PRECIO_CAFE;

        } else if (dinero < MAX_PRECIO_CAFE) {
            throw new Maquina_Cafe_Exception("No tienes suficiente dinero, Introduce mas dinero.");
        }
        if (dosis_cafe > 0 && vasos > 0) {
            dosis_cafe--;
            vasos--;
            monedero += MAX_PRECIO_CAFE;

            System.out.println("Aqui tienes su cafe señor o señorita ");
        } else if (vasos == 0 || dosis_cafe == 0) {
            throw new Maquina_Cafe_Exception("No hay suficientes vasos o no podemos servir cafe ");
        }
        System.out.printf("Su cambio es %.2f ", dinero);
        return dinero;
    }

    public double servirLeche() throws Maquina_Cafe_Exception {
        System.out.println("Introduce el dinero de la maquina");
        double dinero = sc.nextDouble();
        if (dinero > MAX_PRECIO_LECHE) {

            dinero -= MAX_PRECIO_LECHE;

        } else if (dinero < MAX_PRECIO_LECHE) {
            throw new Maquina_Cafe_Exception("No tienes suficiente dinero, Introduce mas dinero.");
        }
        if (dosis_leche > 0 && vasos > 0) {
            dosis_leche--;
            vasos--;
            monedero += MAX_PRECIO_LECHE;

            System.out.println("Su leche señor o señora");
        } else if (vasos == 0 || dosis_leche == 0) {
            throw new Maquina_Cafe_Exception("No hay suficientes vasos o no podemos servir cafe ");
        }
        System.out.printf("Su cambio es %.2f ", dinero);
        return dinero;
    }

    public double servirCafeLeche() throws Maquina_Cafe_Exception {
        System.out.println("Introduce el dinero de la maquina");
        double dinero = sc.nextDouble();
        if (dinero > MAX_PRECIO_CAFE_LECHE) {

            dinero -= MAX_PRECIO_CAFE_LECHE;

        } else if (dinero < MAX_PRECIO_CAFE_LECHE) {
            throw new Maquina_Cafe_Exception("No tienes suficiente dinero, Introduce mas dinero.");
        }
        if (dosis_leche > 0 && dosis_cafe > 0 && vasos > 0) {
            dosis_cafe--;
            dosis_leche--;
            vasos--;
            monedero += MAX_PRECIO_CAFE_LECHE;

            System.out.println("Su  cafe con leche señor o señorita ");
        } else if (vasos == 0 || dosis_leche == 0 || dosis_cafe == 0) {
            throw new Maquina_Cafe_Exception("No hay suficientes vasos o no podemos servir cafe");
        }
        System.out.printf("Su cambio es %.2f ", dinero);
        return dinero;
    }



}

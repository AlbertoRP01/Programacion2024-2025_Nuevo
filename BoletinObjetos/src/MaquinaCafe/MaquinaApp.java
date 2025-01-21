package MaquinaCafe;

import java.util.Scanner;

public class MaquinaApp {

    public static void main(String[] args) throws Maquina_Cafe_Exception {

        Scanner sc = new Scanner(System.in);
        Maquina_Cafe maquina = new Maquina_Cafe(50, 50, 50, 80);
        int opcion = 0;
        while (opcion <= 5) {
        System.out.println("\n1. Servir cafe");
        System.out.println("2. Sevir leche");
        System.out.println("3. Servir cafe con leche");
        System.out.println("4. Consultar estado de la maquina");
        System.out.println("5. salir");
        opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado cafe");
                    maquina.servirCafe();
                    break;

                case 2:
                    System.out.println("Has seleccionado Leche");
                    maquina.servirLeche();
                    break;

                case 3:
                    System.out.println("Has seleccionado cafe con leche");
                    maquina.servirCafeLeche();
                    break;

                case 4:
                    System.out.println("Consultar El estado de la maquina ");
                    System.out.println("Deposito de cafe : " + maquina.getDosis_cafe());
                    System.out.println("Deposito de leche " + maquina.getDosis_leche());
                    System.out.println("monedero " + maquina.getMonedero());
                    break;

                case 5:
                    System.out.println("Volver menu");
                    break;

            }
        }
    }
}

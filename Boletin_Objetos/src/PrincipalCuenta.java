/* import java.util.Scanner;

public class PrincipalCuenta {

    public static void main(String[] args) {

        int dineroMeter;
        int dineroAsacar;
        int opcion = 0;
        Cuenta c1;
        Scanner sc = new Scanner(System.in);
        try {
           c1  = new Cuenta("1234", "juanito", 10);
        } catch (CuentaException e) {
            System.out.println(e.getMessage());

        }
        return;
        do {
            try {


                System.out.println("Pulsa1 para meter dinero, pulsa 2 para sacar dinero, pulsa 3 para consultar saldo y pulsa 4 para finalizar");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    System.out.println("Cuanto dinero quieres meter");
                    dineroMeter = sc.nextInt();

                }
                if (opcion == 2) {
                    System.out.println("Cuanto dinero quieres retirar");
                    dineroAsacar = sc.nextInt();
                }
                if (opcion == 3) {
                    System.out.println("Que quieres consultar");
                    c1.consultarSaldo();
                }
                if (opcion == 4) {

                }
            } catch (CuentaException e){
                System.out.println(e.getMessage());
            }
        }while (opcion == 4) ;
    }
}
 */
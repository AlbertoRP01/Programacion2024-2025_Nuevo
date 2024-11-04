import java.util.Scanner;

public class Ej6_Boletin2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAlumnos;
        numAlumnos = Integer.parseInt(sc.nextLine());
        while (numAlumnos < 1) {
            System.out.println("Error");
            System.out.println("Numero de alumnos");
            numAlumnos = Integer.parseInt(sc.nextLine());
        }
        float nota;
        int aprobado = 0;
        int suspenso = 0;
        int i = 0;
        System.out.println("Nota de cada alumno");
        do {
            i++;
            System.out.println("Alumno n " + i);
            nota = Float.parseFloat(sc.nextLine());
            if (nota >= 5) {
                aprobado++;

            } else {
                suspenso++;
            }
        } while (i < numAlumnos);
        System.out.println("Han aprobado " + aprobado + " alumnos");
        System.out.println("Hna suspendido " + suspenso + "alumnos");
        float porc = (float) aprobado / numAlumnos * 100;
        System.out.printf("El porcentaje de aprobados es de %.2f%%", porc);
    }
}


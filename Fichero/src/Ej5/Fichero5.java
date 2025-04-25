package Ej5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Fichero5 {
    public static void main(String[] args) {

        new Fichero5();

    }

    public Fichero5() {
        try (RandomAccessFile data = new RandomAccessFile("src/Modulo/pradera.bmp", "r")) {
            FileOutputStream out = new FileOutputStream("src/Modulo/praderaColoresInversos.bmp");

            byte[] cabecera = new byte[54];
            data.read(cabecera);
            out.write(cabecera);

            byte[] pixel = new byte[3];

            while (data.read(pixel) != -1) {
                for (int i = 0; i < pixel.length; i++) {
                    pixel[i] = (byte) ~pixel[i];
                }
                out.write(pixel);
            }
            while (data.read(pixel) != -1) {
                for (int i = 0; i < pixel.length; i++) {
                    if (i != 2) {
                        pixel[i] = 0;

                    }

                }
                out.write(pixel);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

package Ej3;

public class PersonajeApp {
    public static void main(String[] args) {
        try {
            Mago a = new Mago("PrepuciusJR", TipoRaza.ELFO, 14, 20, 100);
            Mago b = new Mago("CoñiciusJR", TipoRaza.ENANO, 10, 20, 100);
            Clerigo c = new Clerigo("Tuvergoso19",TipoRaza.ORCO,18,15,100,"ALIBABA");
            a.addHechizo("Avada Kedabra");
            a.addHechizo("Imperio");
            b.addHechizo("Crucio");
            System.out.println(a.toString());
            System.out.println(b.toString());
            a.lanzarHechizo("Avada Kedabra", b);
            b.lanzarHechizo("Crucio", a);
            c.curar(b);
            System.out.println(a.toString());
            System.out.println(b.toString());
            System.out.println(c.toString());

        } catch (PersonajeException e) {
            System.out.println(e.getMessage());
        }
    }
}
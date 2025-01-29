package Ficheros;

import java.time.LocalDate;

public class FicheroTextoFormateado extends  FicheroTexto{
   private TFuentes fuentes;
    private String color;
   private int tamannoFuente;

    public FicheroTextoFormateado(String nombre,  String[] parrafos, TFuentes fuentes, String color, int tamannoFuente) {
        super(nombre,  parrafos);
        this.fuentes = fuentes;
        this.color = color;
        this.tamannoFuente = tamannoFuente;
    }

    public TFuentes getFuentes() {
        return fuentes;
    }

    public void setFuentes(TFuentes fuentes) {
        this.fuentes = fuentes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamannoFuente() {
        return tamannoFuente;
    }

    public void setTamannoFuente(int tamannoFuente) {
        this.tamannoFuente = tamannoFuente;
    }

    @Override
    public long getTamano() {
        return super.getTamano();
    }
}

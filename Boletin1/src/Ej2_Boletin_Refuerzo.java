public class Ej2_Boletin_Refuerzo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("101110");
        System.out.println(sb.reverse());
        String binarioInvertido = sb.reverse().toString();
        int resultado = 0;
        for (int i = 0; i < binarioInvertido.length(); i++) {
            resultado += Integer.parseInt(String.valueOf(binarioInvertido.charAt(i) + ""))
                    * Math.pow(2, i);

        }
        System.out.printf("El numero binario %s es decimal %d  ", binarioInvertido);
    }
}

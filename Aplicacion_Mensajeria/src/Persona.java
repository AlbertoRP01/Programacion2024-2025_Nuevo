public class Persona {
    public static final int TAM_BUZON = 5;
    private String nombre;
    private Mensaje[] mensajesRecibidos;
    private Mensaje[] mensajesEnviados;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.mensajesRecibidos = new Mensaje[TAM_BUZON];
        this.mensajesEnviados = new Mensaje[TAM_BUZON];

    }

    public String getNombre() {
        return nombre;
    }

    public void enviarMensaje(String asunto, String cuerpo, Persona destinatario) throws MensajeException {
        if (asunto.isBlank()) {
            throw new MensajeException("El asunto no puede estar Vacío");
        }
        if (cuerpo.isBlank()) {
            throw new MensajeException("El cuerpo no puede estar  Vacío");
        }
        assert destinatario != null : "El destinatario no puede ser nulo ";
        if (destinatario == this) {
            throw new MensajeException("No Puedes enviar mensajes a ti mismo");

        }
    }

    private int getNumMensajesEnviados() {
        for (int i = 0; i < mensajesEnviados.length; i++) {
            if (mensajesEnviados[i] == null) {
                return i;
            }
        }
        return TAM_BUZON;
    }

    private int getNumMensajesRecibidos() {
        for (int i = 0; i < mensajesRecibidos.length; i++) {
            if (mensajesRecibidos[i] == null) {
                return  i;
            }
        }
        return TAM_BUZON;
    }
}

package src;

public class Cita {
    public enum Estado {
        PENDIENTE,
        CONFIRMADA
    }

    private final String cliente;
    private final String servicio;
    private final String fechaHora;
    private Estado estado;

    public Cita(String cliente, String servicio, String fechaHora) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.fechaHora = fechaHora;
        this.estado = Estado.PENDIENTE;
    }

    public String confirmar() {
        this.estado = Estado.CONFIRMADA;
        return "Confirmacion enviada a " + cliente +
               ": tu cita de '" + servicio + "' para el " + fechaHora +
               " esta " + estado + ".";
    }

    public Estado getEstado() {
        return estado;
    }
}
package src;

public class Cita {
    public enum Estado {
        PENDIENTE,
        CONFIRMADA,
        CANCELADA
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

    public String getCliente() {
        return cliente;
    }

    public Estado getEstado() {
        return estado;
    }

    public String confirmar() {
        this.estado = Estado.CONFIRMADA;
        return "Confirmacion enviada a " + cliente +
               ": tu cita de '" + servicio + "' para el " + fechaHora +
               " esta " + estado + ".";
    }

    public String cancelar() {
        this.estado = Estado.CANCELADA;
        return "Cita cancelada para " + cliente +
               " (" + servicio + " - " + fechaHora + ").";
    }

    public String resumen() {
        return cliente + " | " + servicio + " | " + fechaHora + " | Estado: " + estado;
    }
}
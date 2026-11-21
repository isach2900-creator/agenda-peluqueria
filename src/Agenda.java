package src;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private final List<Cita> citas = new ArrayList<>();

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public Cita buscarPorCliente(String nombreCliente) {
        for (Cita cita : citas) {
            if (cita.getCliente().equalsIgnoreCase(nombreCliente)) {
                return cita;
            }
        }
        return null;
    }
    public String cancelarCitaPorCliente(String nombreCliente) {
        Cita encontrada = buscarPorCliente(nombreCliente);
        if (encontrada == null) {
            return "No se encontro ninguna cita para: " + nombreCliente + ".";
        }
        return encontrada.cancelar();
    }
    public void mostrarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas en la agenda.");
            return;
        }
        for (Cita cita : citas) {
            System.out.println("- " + cita.resumen());
        }
    }
}
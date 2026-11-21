package src;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Cita cita1 = new Cita("Carlos", "Corte y barba", "2026-11-21 11:00");
        Cita cita2 = new Cita("Mateo", "Corte degradado", "2026-11-21 12:30");

        agenda.agregarCita(cita1);
        agenda.agregarCita(cita2);

        System.out.println(cita1.confirmar());
        System.out.println("--- Citas del dia ---");
        agenda.mostrarCitas();
    }
}
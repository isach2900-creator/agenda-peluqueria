package src;

public class Main {
    public static void main(String[] args) {
        Cita cita = new Cita("Carlos", "Corte y barba", "2026-11-21 11:00");
        String confirmacion = cita.confirmar();
        System.out.println(confirmacion);
    }
}
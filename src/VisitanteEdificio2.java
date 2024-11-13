import java.util.Scanner;

public class VisitanteEdificio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nom;
        int edad;
        char genero;
        double altura;
        boolean residente;


        System.out.print("Ingrese el nombre del visitante: ");
        nom = scanner.nextLine();

        System.out.print("Ingrese la edad del visitante: ");
        edad = scanner.nextInt();

        System.out.print("Ingrese el género del visitante (M/F): ");
        genero = scanner.next().charAt(0);

        System.out.print("Ingrese la altura del visitante (en metros): ");
        altura = scanner.nextDouble();

        System.out.print("¿Es residente? (true/false): ");
        residente = scanner.nextBoolean();


        int cantidadVisit = 0;
        double tiempoTotEstadia = 0.0;


        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese el tiempo de estadía en horas para la visita " + i + ": ");
            double tiempoEstadia = scanner.nextDouble();
            tiempoTotEstadia += tiempoEstadia;
            cantidadVisit++;
        }


        double tiempoPromEstadia = tiempoTotEstadia / cantidadVisit;


        String edadCategoria = (edad >= 18) ? "Mayor de edad" : "Menor de edad";


        System.out.println("\nInformación del Visitante:");
        System.out.println("Nombre: " + nom);
        System.out.println("Edad: " + edad + " (" + edadCategoria + ")");
        System.out.println("Género: " + genero);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Residente: " + residente);
        System.out.println("Cantidad total de visitas: " + cantidadVisit);
        System.out.printf("Tiempo promedio de estadía: %.2f horas\n", tiempoPromEstadia);



        scanner.close();
    }
}

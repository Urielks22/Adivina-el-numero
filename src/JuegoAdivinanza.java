import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(101); // Genera un número aleatorio entre 0 y 100
        int intentosRestantes = 5;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Intenta adivinar el número generado entre 0 y 100.");

        while (intentosRestantes > 0) {
            System.out.println("Tienes " + intentosRestantes + " intentos restantes.");
            System.out.print("Ingresa tu intento: ");
            int intento = scanner.nextInt();

            if (intento < 0 || intento > 100) {
                System.out.println("El número ingresado está fuera del rango permitido. Intenta de nuevo.");
                continue;
            }

            if (intento == numeroAdivinar) {
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
                break;
            } else if (intento < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("El número a adivinar es menor.");
            }

            intentosRestantes--;
        }

        if (intentosRestantes == 0) {
            System.out.println("¡Se acabaron los intentos! El número a adivinar era: " + numeroAdivinar);
        }

        scanner.close();
    }
}

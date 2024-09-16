import java.util.Scanner;

public class lista1ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor para as polegadas: ");
        float polegadas = scanner.nextInt();

        float convermm = 25.4f;

        float milimetros = polegadas * convermm;

        System.out.printf("A coonversão de polegadas para milimetros é: %.1f ", milimetros);

        scanner.close();

    }
}
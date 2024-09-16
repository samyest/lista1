import java.util.Scanner;

public class lista1ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor para as horas: ");
        float horas = scanner.nextInt();
        
        System.out.println("Digite o valor para os minutos: ");
        float minutos = scanner.nextInt();

        System.out.println("Digite o valor para os segundos: ");
        float segundos = scanner.nextInt();


        float totalSegundos = ((horas * 60 * 60) + (minutos * 60) + segundos);


        System.out.printf("A coonversão de polegadas para milimetros é: %.1f ", totalSegundos);

        scanner.close();

    }
}
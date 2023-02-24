import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, media;

        System.out.println("Digite a primeira nota: ");
        a = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        b = scanner.nextDouble();

        scanner.close();

        a = a * 3.5;
        b = b * 7.5;
        media = (a + b) / 11;

        System.out.println("MÉDIA = " + media); // Aqui será exibido o resultado

    }
}

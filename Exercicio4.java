import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, maior, menor;

        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextInt();
        maior = num1;
        menor = num1;

        System.out.println("Informe o segundo número: ");
        num2 = sc.nextInt();
        if (num2 > maior) {
            maior = num2;
        } else if (num2 < menor) {
            menor = num2;
        }

        System.out.println("Informe o terceiro número: ");
        num3 = sc.nextInt();
        if (num3 > maior) {
            maior = num3;
        } else if (num3 < menor) {
            menor = num3;
        }

        sc.close();
        System.out.println("MAIOR = " + maior);
        System.out.println("MENOR = " + menor);
    }
}

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, primeiro, segundo, terceiro;

        System.out.println("Informe o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = sc.nextInt();

        System.out.println("Informe o terceiro número: ");
        num3 = sc.nextInt();

        sc.close();

        if (num1 > num2) {
            if (num2 > num3) {
                primeiro = num1;
                segundo = num2;
                terceiro = num3;
            } else if (num1 > num3) {
                primeiro = num1;
                segundo = num3;
                terceiro = num2;
            } else {
                primeiro = num3;
                segundo = num1;
                terceiro = num2;
            }
        } else if (num2 > num3) {
            if (num1 > num3) {
                primeiro = num2;
                segundo = num1;
                terceiro = num3;
            } else {
                primeiro = num2;
                segundo = num3;
                terceiro = num1;
            }
        } else {
            primeiro = num3;
            segundo = num2;
            terceiro = num1;
        }

        System.out.println(terceiro);
        System.out.println(segundo);
        System.out.println(primeiro);

    }

}

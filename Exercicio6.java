import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.000");
        int distancia;
        double combustivel;

        System.out.println("Informe a distância total percorrida (em km): ");
        distancia = sc.nextInt();
        System.out.println("Informe o total de combustivel gasto (em litro): ");
        combustivel = sc.nextDouble();

        sc.close();

        System.out.print(df.format(distancia / combustivel) + " km/l");

    }

}

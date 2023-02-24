import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        String nomVendedor;
        /*Aqui tá dando erro porque esse dado é armazenado mas não serve pra nada,
        não entendi porque é pedido isso no exercício. */
        Double salarioFixo, vendas;

        System.out.println("Informe o primeiro nome do vendedor: ");
        nomVendedor = sc.nextLine();
        System.out.println("Informe valor do salário fixo: ");
        salarioFixo = sc.nextDouble();
        System.out.println("Informe o valor de vendas em dinheiro: ");
        vendas = sc.nextDouble();

        sc.close();

        System.out.println("TOTAL = R$ " + df.format(salarioFixo + (vendas * 0.15)));

    }
}

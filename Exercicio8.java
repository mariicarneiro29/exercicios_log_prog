import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rHomem, rMulher, rConj, impRenda, rLiq;
        int alio;

        System.out.println("Informe a renda do homem: ");
        rHomem = sc.nextDouble();
        System.out.println("Informe a renda da mulher: ");
        rMulher = sc.nextDouble();

        sc.close();

        rConj = rHomem + rMulher;

        if (rConj <= 900.00) {
            alio = 0;
            impRenda = 0;
            System.out.println("RENDA CONJUNTA: " + rConj);
            System.out.println("ALÍQUOTA UTILIZADA: Isento");
            System.out.println("IMPOSTO DE RENDA: Isento");
            System.out.println("RENDA LÍQUIDA: " + rConj);
        } else if ((rConj >= 900.01) && (rConj <= 1500.00)) {
            alio = 10;
            impRenda = rConj * 0.10;
        } else if ((rConj >= 1500.01) && (rConj <= 2500.00)) {
            alio = 15;
            impRenda = rConj * 0.15;
        } else {
            alio = 25;
            impRenda = rConj * 0.25;
        }

        rLiq = rConj - impRenda;

        if (alio != 0) {
            System.out.println("RENDA CONJUNTA: " + rConj);
            System.out.println("ALÍQUOTA UTILIZADA: " + alio + "%");
            System.out.println("IMPOSTO DE RENDA: " + impRenda);
            System.out.println("RENDA LÍQUIDA: " + rLiq);
        }

    }

}

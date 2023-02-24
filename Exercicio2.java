import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFuncionario, hsTrab;
        double salario;

        System.out.println("Informe o número do funcionário: ");
        numFuncionario = sc.nextInt();
        System.out.println("Informe as horas trabalhadas: ");
        hsTrab = sc.nextInt();
        System.out.println("Informe o valor pago por hora trabalhada: ");
        salario = sc.nextDouble();

        sc.close();

        System.out.println("NÚMERO = " + numFuncionario);
        System.out.println("SALÁRIO = " + (hsTrab * salario));

    }
}

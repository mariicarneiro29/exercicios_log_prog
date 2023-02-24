import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int idadeDias, anos, meses, dias, resto;
    
        System.out.println("Informe sua idade em dias: ");
        idadeDias = sc.nextInt();
    
        sc.close();
    
        anos = idadeDias / 365;
        resto = idadeDias % 365;
        meses = resto / 30;
        dias = resto % 30;
    
        System.out.println(anos + " ano (s)");
        System.out.println(meses + " mês (es)");
        System.out.println(dias + " dia (s)");
    }

}

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int tempoEvento, horas, minutos, segundos, resto;

    System.out.println("Informe o tempo do evento em segundos: ");
    tempoEvento = sc.nextInt();

    sc.close();

    horas = tempoEvento / 3600;
    resto = tempoEvento % 3600;
    minutos = resto / 60;
    segundos = resto % 60;

    System.out.println("HH:MM:SS = " + horas + ":" + minutos + ":" + segundos);
    }
}

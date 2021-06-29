import java.util.Scanner;

public class exx02 {
    public static void main(String[] args) {
        /* Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
        solicite ao usuario que digite o tempo de um filme em minutos e informe a duração
        desse filme em horas e segundos
         */
        Scanner leitor = new Scanner(System.in);
        int minuto;
        int horas;
        int segundo;
        System.out.println("Digite o tempo do filme em minutos");
        minuto = leitor.nextInt();
        horas = minuto / 60;
        segundo = minuto * 60;
        System.out.println("A duração do filme em horas é: " + horas);
        System.out.println("A duração do filme em segundo é: " + segundo);
    }
}

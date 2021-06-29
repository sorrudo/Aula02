import java.util.Scanner;

public class exx04 {
    public static void main(String[] args) {
        /* Um robô de combate só deve ativar sua arma principal quando o
        inimigo está a 70cm de distância. Faça um programa onde o usuario informe a
        distância do inimigo e sejam exibidas as mensagens "ATIVADO" ou "DESATIVADO"
        dependendo do status da arma */
        Scanner leitor = new Scanner(System.in);
        int distancia;
        System.out.println("Digite a distância do inimigo em centímetro");
        distancia = leitor.nextInt();
        if (distancia > 70) {
            System.out.println("Arma DESATIVADA");
        }else {
            System.out.println("Arma ATIVADA");
        }
        leitor.close();
    }
}

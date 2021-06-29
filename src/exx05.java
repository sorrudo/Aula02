import java.util.Scanner;

public class exx05 {
    public static void main(String[] args) {
        /*Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso.
         Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual
         deles deve ser carregado pelo drone. */
        Scanner leitor = new Scanner(System.in);
        int peso1;
        int peso2;
        int peso3;
        System.out.println("Digite o valor do primeiro peso");
        peso1 = leitor.nextInt();
        System.out.println("Digite o valor do segundo peso");
        peso2 = leitor.nextInt();
        System.out.println("Digite o valor do terceiro peso");
        peso3 = leitor.nextInt();
        if (peso1 < peso2 && peso1 < peso3) {
            System.out.println("O Drone vai carregar primeiro o 1° peso indicado");
        }else {
            if (peso2 < peso1 && peso2 < peso3) {
                System.out.println("O Drone vai carregar primeiro o 2° peso indicado");
            }else {
                System.out.println("O Drone vai carregar primeiro o 3° peso indicado");
            }
        }
        leitor.close();
    }
}

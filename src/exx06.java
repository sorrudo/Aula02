import java.util.Scanner;

public class exx06 {
    public static void main(String[] args) {
        /*Uma   loja   oferece   um   desconto   de   3%   aos   clientes
          que   tiverem   o   cupom “DIADEFESTA”. Faça um programa onde o
          funcionário digite o valor da compra e um cupom, informando o valor final a ser pago.
         */
        Scanner leitor = new Scanner(System.in);
        double valor;
        String cupom;
        System.out.println("Digite o valor do produto");
        valor = leitor.nextDouble();
        System.out.println("Digite o nome do cupom se tiver");
        cupom = leitor.next();
        if ( cupom.equalsIgnoreCase( "DIADEFESTA")) {
            valor = valor * 0.97;
            System.out.println("O seu produto com desconto fica R$ " + valor + " reais");
        }else {
            System.out.println("Seu cupon não exite, o valor do produto fica R$ " + valor + " reais");
        }
        leitor.close();
    }

}

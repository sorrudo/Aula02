import java.util.Scanner;

public class exx01 {
    public static void main(String[] args) {
        /*Para um ano de nascimento fornecido pelo o úsuario, informe a idade que ele terá em
        31 de dezembro de 2021*/
        Scanner leitor = new Scanner(System.in);
        int ano;
        int idade;
        System.out.println("Digite seu ano de nascimento");
        ano = leitor.nextInt();
        idade = 2021 - ano;
        System.out.println("Em 31 de dezembro de 2021 você terá " + idade + " anos.");
        leitor.close();


    }
}

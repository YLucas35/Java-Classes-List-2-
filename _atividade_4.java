package Java_Lista_2_Se_e_Mod;

import java.util.Scanner;

public class _atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb1, numb2, result;

        System.out.println("Insira o ano em que estamos agora");
        numb1 = sc.nextDouble();

        System.out.println("Insira o seu ano de nascimento");
        numb2 = sc.nextDouble();

        result = numb1 - numb2;

        if (result >= 18) {
            System.out.println("Você é maior de idade");
        }
        else {
            System.out.println("Você é menor de idade");
        }
    }
}

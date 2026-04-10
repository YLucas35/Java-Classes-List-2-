package Java_Lista_2_Se_e_Mod;

import java.util.Scanner;

public class _atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb1, result;

        System.out.println("Insira um número para saber se ele é divisível por 2 e por 3");
        numb1 = sc.nextInt();

        result = numb1 % 2 % 3;

        if (result == 0) {
            System.out.println("Este número é divisível por 2 e por 3");
        }
        else {
            System.out.println("Este número não é divisível por 2 e nem por 3");
        }
    }
}

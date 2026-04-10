package Java_Lista_2_Se_e_Mod;

import java.util.Scanner;

public class _atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb1, result;

        System.out.println("Insira um número para saber se ele é múltiplo de 5");
        numb1 = sc.nextDouble();

        result = numb1 % 5;

        if (result == 0) {
            System.out.println("Ele é múltiplo de 5");
        }
        else {
            System.out.println("Ele não é múltiplo de 5");
        }
    }
}


package Java_Lista_2_Se_e_Mod;

import java.util.Scanner;

public class _atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb1, result;

        System.out.println("Insira um número para saber se ele é par ou impar");
        numb1 = sc.nextDouble();

        result = numb1 % 2;

        if (result == 0) {
            System.out.println("É par");
        }
        else {
            System.out.println("É impar");
        }
    }
}

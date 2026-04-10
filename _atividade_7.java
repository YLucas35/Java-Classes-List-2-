package Java_Lista_2_Se_e_Mod;

import java.util.Scanner;

public class _atividade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb1;

        System.out.println("Insira um número para saber se ele é postivo, negativo ou zero");
        numb1 = sc.nextInt();

        if (numb1 > 0) {
            System.out.println("Esse número é positivo");
        }
        else if (numb1 < 0) {
            System.out.println("Esse número é negativo");
        }
        else {
            System.out.println("Esse número é zero");
        }
    }
}

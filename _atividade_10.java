package Java_Lista_2_Se_e_Mod;

import java.util.Scanner;

public class _atividade_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb1;

        System.out.println("Qual é a senha?");
        numb1 = sc.nextInt();

        if (numb1 == 1234) {
            System.out.println("Acesso permitido");
        }
        else {
            System.out.println("Acesso negado");
        }
    }
}

package Java_Lista_2_Se_e_Mod;

import java.util.Scanner;

public class _atividade_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb1, numb2;

        System.out.println("Insira o primeiro número");
        numb1 = sc.nextInt();

        System.out.println("Insira o segundo número");
        numb2 = sc.nextInt();

        if (numb1 > numb2) {
            System.out.printf(numb1+" é maior do que "+numb2);
        }
        else {
            System.out.printf(numb2+" é maior do que "+numb1);
        }
    }
}

package Java_Lista_2_Se_e_Mod;

import java.util.Scanner;

public class _atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb1, numb2, result;

        System.out.println("Insira a primeira nota do aluno");
        numb1 = sc.nextDouble();

        System.out.println("Insira a segunda nota do aluno");
        numb2 = sc.nextDouble();

        result = (numb1 + numb2) / 2;

        if (result >= 7) {
            System.out.println("Ele está aprovado");
        }
        else {
            System.out.println("Ele está reprovado");
        }
    }
}

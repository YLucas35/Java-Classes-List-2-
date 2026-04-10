package Java_Lista_2_Se_e_Mod;

import java.util.Scanner;

public class _atividade_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numb1, numb2, result;

        System.out.println("Insira um número para ser o dividendo da operação");
        numb1 = sc.nextDouble();

        System.out.println("Insira um número para ser o divisor da operação");
        numb2 = sc.nextDouble();

        if (numb2 == 0) {
            System.out.println("Erro: Não é possível dividir por zero!");
        } else {
            // Se não for zero, aí sim calculamos o resto
            result = numb1 % numb2;

            if (result == 0) {
                System.out.println("Divisão exata");
            } else {
                System.out.println("O resto da divisão é: " + result);
            }
        }
    }
}

package Java_Lista_2_Se_e_Mod;

import java.util.Scanner;

public class _atividade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price, discount, result;

        System.out.println("Digite o valor do produto para ver se ele tem um desconto");
        price = sc.nextDouble();

        if (price >= 100) {
            discount = price * 0.10;
            result = price - discount;
            System.out.printf("Você tem que pagar: R$%.2f%n", result);
        }
        else {
            System.out.printf("Você tem que pagar: R$R$%.2f%n", price);
        }
    }
}

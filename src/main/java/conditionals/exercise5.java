package conditionals;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int cod, quant;
        double total = 0;

        System.out.println("Digite o código do item");
        cod = sc.nextInt();
        System.out.println("Digite a quantidade");
        quant = sc.nextInt();

        if (cod == 1 ) {
            total = quant * 4.0;
        } else if (cod == 2){
            total = quant * 4.50;
        } else if (cod == 3) {
            total = quant * 5.00;
        } else if (cod == 4) {
            total = quant * 2.00;
        } else if (cod == 5) {
            total = quant * 1.50;
        } else{
            System.out.println("Produto não encontrado!");
        }

        if (cod >= 1 && cod <= 5) {
            System.out.println("Total: " + total);

        }


    }

}

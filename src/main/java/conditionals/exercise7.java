package conditionals;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Digite o valor de x: ");
        x = sc.nextDouble();
        System.out.println("Digite o valor de y");
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }


    }
}

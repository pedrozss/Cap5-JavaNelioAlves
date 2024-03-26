package conditionals;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o valor A");
        a = sc.nextInt();
        System.out.println("Digite o valor B");
        b = sc.nextInt();

        if (a % b == 0 && b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

    }
}

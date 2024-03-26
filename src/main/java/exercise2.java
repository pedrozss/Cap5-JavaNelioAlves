import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Digite um número");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }
    }
}

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Digite um número");
        number = sc.nextInt();

        if (number < 0) {
            System.out.println(number + " É um número negativo");
        } else {
            System.out.println(number + " Não é um número negativo");
        }

    }


}

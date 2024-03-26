import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        double n1 = sc.nextDouble();

        if (n1 >= 0 && n1 <= 25) {
            System.out.println("Intervalo 0-25");
        } else if (n1 > 25 && n1 <= 50) {
            System.out.println("Intervalo 25-50");
        } else if (n1 > 50 && n1 <= 75) {
            System.out.println("Intervalo 50-75");
        } else if (n1 > 75 && n1 <= 100) {
            System.out.println("Intervalo 75-100");
        } else {
            System.out.println("Fora de intervalo");
        }







    }
}

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario,imposto;

        System.out.println("Digite o salário");
        salario = sc.nextDouble();

        if (salario >= 0 && salario <= 2000) {
            imposto = 0.0;
        } else if (salario > 2000 && salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        } else if (salario > 3000 && salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento de imposto");
        } else {
            System.out.println("Imposto: " + imposto);
        }

    }
}

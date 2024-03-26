package conditionals;

import java.util.Scanner;

public class thirdconditional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert product value");
        double value = sc.nextDouble();

        double discount = (value <= 20.0) ? value * 0.1 : value * 0.05;

        System.out.println(discount);




    }
}

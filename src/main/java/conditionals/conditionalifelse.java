package conditionals;

import java.util.Scanner;

public class conditionalifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Que horas são?");
        hora = sc.nextInt();

        if (hora < 12 && hora >= 6) {
            System.out.println("Bom dia");

        } else if (hora >= 12 && hora < 18) {
                System.out.println("Boa tarde");

            } else {
                System.out.println("Boa noite!");
            }



    }


}

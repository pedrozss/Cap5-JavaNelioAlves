package conditionals;

import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the day number");
        int x = sc.nextInt();
        String day ;

        switch (x) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid number";
                break;
        }

        System.out.println("Today is " + day + "!" + " Have a good day.");



    }
}

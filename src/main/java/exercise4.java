import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horainicial, horafinal, duracao;

        System.out.println("Digite o horário de inicio da partida");
        horainicial = sc.nextInt();
        System.out.println("Digite o horário de termino da partida");
        horafinal = sc.nextInt();

        if (horainicial < horafinal ) {
            duracao = horafinal - horainicial;
        } else {
            duracao = 24 - horainicial + horafinal;
        }

        System.out.println("O jogo durou " + duracao + " horas.");

    }
}

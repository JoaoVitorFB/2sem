import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha um numero de 0 a 10");
        Integer num = leitor.nextInt();

        Integer sorteio = 0;
        Integer aleatorio = 0;

        do {
            aleatorio = ThreadLocalRandom.current().nextInt(11);
            sorteio++;
        } while (aleatorio != num);

        if (sorteio <= 3){
            System.out.println("Você é MUITO sortudo. (sorteado " + sorteio + " vezes)");
        } else if (sorteio <= 10) {
            System.out.println("Você é sortudo. (sorteado " + sorteio + " vezes)");
        } else {
            System.out.println("É melhor você para de apostar e ir trabalhar. (sorteado " + sorteio + " vezes)");

        }
    }
}

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {

        Integer aleatorio = 0;
        Integer total = 0;

        do {
            aleatorio = ThreadLocalRandom.current().nextInt(11);
            total+= aleatorio;
        } while (aleatorio != 0);

        System.out.println("A soma dos números é: " + total);
    }
}

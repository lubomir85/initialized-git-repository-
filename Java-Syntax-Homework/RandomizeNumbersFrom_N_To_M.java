import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomizeNumbersFrom_N_To_M {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int minimum = Math.min(N, M);
        int maximum = Math.max(M, N);

        Random randomNumber = new Random();
        int range = maximum - minimum + 1;

        Set<Integer> generated = new LinkedHashSet<>();
        while (generated.size()< range){
            int randomNum = randomNumber.nextInt(range) + minimum;
            generated.add(randomNum);

        }

        generated.forEach(p -> System.out.println(p));
    }

}

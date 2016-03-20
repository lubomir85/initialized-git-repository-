import java.util.Scanner;

public class SumNumbersFrom1_To_N {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = Integer.parseInt(scn.nextLine());
        int sum = 0 ;

        int count = 1 ;
        while ( count <= n )
        {
            sum += count ;
            count++ ;
        }
        System.out.println(sum);
    }

}
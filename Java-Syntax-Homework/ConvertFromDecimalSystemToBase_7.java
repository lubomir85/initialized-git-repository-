import java.util.Scanner;

public class ConvertFromDecimalSystemToBase_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int decimal = scan.nextInt();

       String base7 = Integer.toString(decimal,7);
        System.out.println(base7);
    }


}


import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int a = Integer.parseInt(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());

        String hex = Integer.toHexString(a).toUpperCase();
        String binary = Integer.toString(a, 2);


        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|",
                hex, Integer.parseInt(binary),b,c );

    }
}

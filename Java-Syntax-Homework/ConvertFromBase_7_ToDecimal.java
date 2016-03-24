import java.util.Scanner;

public class ConvertFromBase_7_ToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       String baseSevenNums = scan.nextLine();
        int decimal = Integer.parseInt(baseSevenNums, 7);
        System.out.println(decimal);
    }
}

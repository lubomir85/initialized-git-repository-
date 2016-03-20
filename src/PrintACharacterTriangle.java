import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = Integer.parseInt(scn.nextLine());

        for (int i = 1; i <= n  ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(j+97) + " ");
            }
            System.out.println();
        }


        for (int i = n -1; i > 0  ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(j+97) + " ");
            }
            System.out.println();
        }
    }
}

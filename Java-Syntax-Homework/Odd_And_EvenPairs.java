import java.util.Scanner;

public class Odd_And_EvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbars = scan.nextLine().split(" ");
        int numLength = numbars.length;

        if ( numLength % 2  != 0 ){
            System.out.println("Invalid length");
        }
        else{
            for (int i = 0; i < numLength - 1; i += 2) {

                if ((Integer.parseInt(numbars[i]) % 2 )== 0 && (Integer.parseInt(numbars[i + 1])% 2) == 0 ){
                    System.out.printf("%s, %s -> both are even\n", numbars[i], numbars[i + 1]);
                }
                else if ((Integer.parseInt(numbars[i]) % 2) != 0 && (Integer.parseInt(numbars[i + 1]) % 2) != 0) {
                    System.out.printf("%s, %s -> both are odd\n", numbars[i], numbars[i + 1]);
                }
                else {
                    System.out.printf("%s, %s -> different\n", numbars[i], numbars[i + 1]);
                }

            }

        }


    }
}

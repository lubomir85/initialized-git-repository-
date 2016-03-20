import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {
        double number1 = getANumber();
        double number2 = getANumber();
        double number3 = getANumber();
        System.out.println( String.format("Average is : %.2f",average(number1, number2, number3)));



    }
    private static double average(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3;
    }

    private static double getANumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        return input.nextDouble();
    }

}

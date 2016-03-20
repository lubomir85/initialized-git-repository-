import java.util.Scanner;

public class GhettoNumberSystem {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String digits = input.nextLine();
    String[] expression = {"Gee","Bro","Zuz","Ma","Duh","Yo","Dis","Hood","Jam","Mack"};
    String word = "";

    for(int i = 0; i < digits.length(); i++){

        word += expression[Integer.parseInt(Character.toString(digits.charAt(i)))];
    }
    System.out.println(word);

  }
}


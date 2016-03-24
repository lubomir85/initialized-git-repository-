import java.util.Scanner;

public class CharacterMultipleier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] words = scan.nextLine().split(" ");
        String firstWords = words[0];
        String secondWords = words[1];

        int finalSum = calcolateCharactersValue(firstWords,secondWords);
        System.out.println(finalSum);


    }
    public static int calcolateCharactersValue(String firstWords, String secondWords){
     int sum = 0;
        int bigLength = Math.max(firstWords.length(),secondWords.length());
        int smileLength = Math.min(firstWords.length(),secondWords.length());

        String bigWords = "";
        if (firstWords.length() > secondWords.length()){
            firstWords = bigWords;
        }else {
            bigWords = secondWords;
        }
        for (int i = 0; i <bigLength ; i++) {
            if (smileLength > i){
                sum  += firstWords.charAt(i) * secondWords.charAt(i);
            }else {
                sum += bigWords.charAt(i);
            }
        }
        return sum;
    }
}

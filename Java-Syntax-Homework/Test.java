import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nextLine = scan.nextLine();
        String[]  elements = nextLine.split(" ");
        int[] nums = new int[elements.length];

        for (int i = 0; i <elements.length ; i++) {
           nums[i] = Integer.parseInt(elements[i]);

        }
         int num ;
        int sum = 0;
        for (int i = 0; i <nums.length ; i++) {

               num = nums[i] + 2  ;
              if ( i == 2)


             System.out.println(sum);
            }

        }


    }


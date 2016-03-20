
public class AssignVariables {
    public static void main(String[] args) {

        byte variblesByte = 127;
        short variblesShort = 32767;
        int variblesInt = 2000000000;
        long variblesLong = 919827112351L;
        char variblesChar = 'c';
        boolean variblesbool = false;
        float variblesFloat = 0.5f;
        double variblesDouble =0.1234567891011;
        String variblesString = "Palo Alto";


        System.out.println(String.format(" Byte : %d \n short : %d \n Int : %d " +
                "  \n Long : %d \n Char : %c \n Boolean : %b \n Float : %.1f \n Double : %.13f \n String : %s ",
                variblesByte,variblesShort,variblesInt,variblesLong,variblesChar,
                variblesbool,variblesFloat,variblesDouble,variblesString));
    }
}



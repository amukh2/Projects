// any imports here
import java.util.Scanner;

/**
     * Description goes here
     * @author [Anshu Mukherjee]
     * @version [11/7/24]
     */
public class DataFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your favorite integer?");
        int userNum = sc.nextInt();
        char userChar = sc.next().charAt(0);
        favNum(userNum);
        favChar(userChar);
    }


    public static void favNum(int num) {
        if (num >= 0){
            System.out.println("\n" + num + " is a positive number,");
        }
        else {
            System.out.println(num + " is a negative number,");
        }

        if (num > 1000){
            System.out.println("\nit is greater than 1000,");
        }
        else if (num > 100){
            System.out.println("\nit is greater than 100,");
        }
        else if (num > 10){
            System.out.println("\nit is greater than 10,");
        }

        if (num % 2 == 0){
            System.out.println("\nit is even,");
        }
        else {
            System.out.println("\nit is odd,");
        }

        switch (num){
            case 2:
                System.out.println("\nit is the atomic number of the noble gas Helium.");
                break;

            case 10:
                System.out.println("\nit is the atomic number of the noble gas Neon.");
                break;

            case 18:
                System.out.println("\nit is the atomic number of the noble gas Argon.");
                break;

            case 36:
                System.out.println("\nit is the atomic number of the noble gas Krypton.");
                break;

            case 54:
                System.out.println("\nit is the atomic number of the noble gas Xenon");
                break;

            case 86:
                System.out.println("\nit is the atomic number of the noble gas Radon.");
                break;

            case 118:
                System.out.println("\nit is the atomic number of the noble gas Oganesson.");
                break;

            default:
                System.out.println("\nit is not the atomic number of a noble gas.");
        }

    }

    public static void favChar(char a){
        int ascii = a;
        char[] vowel = {'a','e','i','o','u'};

        if (ascii >= 48 && ascii <= 57){
            System.out.println("\n" + a + " is a number,");
        }
        else if (ascii >= 65 && ascii <= 90){
            System.out.println("\n" + a + " is a uppercase letter,");
        }
        else if (ascii >= 97 && ascii <= 122){
            System.out.println("\n" + a + " is a lowercase letter,");
        }
    }
}

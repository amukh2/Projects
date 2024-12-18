// any imports here
import java.util.Scanner;

/**
     * Program that prints information about your favorite number and alphanumeric character.
     * @author [Anshu Mukherjee]
     * @version [11/14/24]
     */
public class DataFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your favorite integer? ");
        int userNum = sc.nextInt();
        favNum(userNum);
        System.out.print("\nWhat is your favorite alphanumeric character? ");
        char userChar = sc.next().charAt(0);
        favChar(userChar);
    }


    public static void favNum(int num) {
        if (num >= 0) {
            System.out.println("\n  " + num + " is a positive number,");
        } else {
            System.out.println("\n  " + num + " is a negative number,");
        }

        if (num > 1000) {
            System.out.println("\n  it is greater than 1000,");
        } else if (num > 100) {
            System.out.println("\n  it is greater than 100,");
        } else if (num > 10) {
            System.out.println("\n  it is greater than 10,");
        } else {
            System.out.println("\n  it is not greater than 10,");
        }

        if (num % 2 == 0) {
            System.out.println("\n  it is even,");
        } else {
            System.out.println("\n  it is odd,");
        }

        switch (num) {
            case 2:
                System.out.println("\n  it is the atomic number of the noble gas Helium.");
                break;

            case 10:
                System.out.println("\n  it is the atomic number of the noble gas Neon.");
                break;

            case 18:
                System.out.println("\n  it is the atomic number of the noble gas Argon.");
                break;

            case 36:
                System.out.println("\n  it is the atomic number of the noble gas Krypton.");
                break;

            case 54:
                System.out.println("\n  it is the atomic number of the noble gas Xenon");
                break;

            case 86:
                System.out.println("\n  it is the atomic number of the noble gas Radon.");
                break;

            case 118:
                System.out.println("\n  it is the atomic number of the noble gas Oganesson.");
                break;

            default:
                System.out.println("\n  it is not the atomic number of a noble gas.");
        }

    }

    public static void favChar(char a) {
        String vowels = "aeiou";
        String str = Character.toString(a);
        String properNum;
        int index = 0;

        if (Character.isDigit(a)) {
            System.out.println("\n  " + a + " is a number,");
            index = (int)a - (int)'0' + 1;
        } else if ( Character.isLetter(a) && Character.isUpperCase(a)) {
            System.out.println("\n  " + a + " is a uppercase letter,");
            index = (int)a - (int)'A' + 1;
        } else if (Character.isLetter(a) && Character.isLowerCase(a)) {
            System.out.println("\n  " + a + " is a lowercase letter,");
            index = (int)a - (int)'a' + 1;
        }

        if (Character.isLetter(a)) {
            if (!vowels.contains(str.toLowerCase())) {
                System.out.println("\n  it is not a vowel,");
            } else {
                System.out.println("\n  it is a vowel,");
            }
        }

        System.out.println("\n  its ASCII value is " + (int)a + ",");

        properNum = switch (index) {
            case 1, 11, 21 -> index + "st";
            case 2, 12, 22 -> index + "nd";
            case 3, 13, 23 -> index + "rd";
            default -> index + "th";
        };

        if (Character.isLetter(a)) {
            System.out.println("\n  and it is the " + properNum + " letter of the alphabet.");
        } else if (Character.isDigit(a)){
            System.out.println("\n  and it is the " + properNum + " digit.");
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zookeeper {
    public static void main(String[] args) {
        File hippo = new File("Hippo.txt");
        File tiger = new File("Tiger.txt");
        File camel = new File("Camel.txt");
        File aardvark = new File("Aardvark.txt");

        Scanner scan = new Scanner(System.in);

        System.out.println("What habitat would you like to look at?");
        System.out.println("1. Hippo\n2. Camel\n3. Tiger\n4. Aardvark");
        int habitat = scan.nextInt();

        switch (habitat){
            case 1:
                printInfo("Hippo");
                printAnimal(hippo);
                break;

            case 2:
                printInfo("Camel");
                printAnimal(camel);
                break;

            case 3:
                printInfo("Tiger");
                printAnimal(tiger);
                break;

            case 4:
                printInfo("Aardvark");
                printAnimal(aardvark);
                break;

            default:
                break;
        }
    }

    public static void printInfo(String animal){
        double min = 50.0, max = 100.0;
        double weather = min + (Math.random() * ((max - min) + 1));
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(format);

        System.out.println("Current Habitat: " + animal);
        System.out.print("Current Time: ");

        int hours1 = (int) formattedTime.charAt(0) - '0';
        int hours2 = (int) formattedTime.charAt(1) - '0';

        int hours = hours1 * 10 + hours2;

        String amOrPm;
        if (hours < 12) {
            amOrPm = "AM";
            hours += 12;
        } else {
            amOrPm = "PM";
            hours -= 12;
        }
        hours %= 12;

        if (hours == 0) {
            System.out.print("12");

            for (int i = 2; i < 8; ++i) {
                System.out.print(formattedTime.charAt(i));
            }
        } else {
            System.out.print(hours);
            for (int i = 2; i < 8; ++i) {
                System.out.print(formattedTime.charAt(i));
            }
        }

        System.out.println(" " + amOrPm);
        System.out.printf("Habitat Temp: %.2fF", weather);
    }

    public static void printAnimal(File file){
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (FileNotFoundException e){
            System.out.println("\nNo file!");
        }
    }
}
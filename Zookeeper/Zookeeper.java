import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.util.Math;

public class Zookeeper {
    public static void main(String[] args){
        double min = 50.0, max = 100.0;
        double weather = min + (Math.random() * ((max - min) + 1));
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(format);

        System.out.println("Current Habitat: Camel ");
        System.out.print("Current Time: ");

        int hours1 = (int)formattedTime.charAt(0) - '0';
        int hours2 = (int)formattedTime.charAt(1) - '0';

        int hours = hours1 * 10 + hours2;

        String amOrPm;
        if (hours < 12) {
            amOrPm = "AM";
            hours += 12;
        }
        else {
            amOrPm = "PM";
            hours -= 12;
        }
        hours %= 12;

        if (hours == 0) {
            System.out.print("12");

            for (int i = 2; i < 8; ++i) {
                System.out.print(formattedTime.charAt(i));
            }
        }
        else {
            System.out.print(hours);
            for (int i = 2; i < 8; ++i) {
                System.out.print(formattedTime.charAt(i));
            }
        }

        System.out.println(" " + amOrPm);
        System.out.printf("Habitat Temp: %.2fF", weather);

    }
}
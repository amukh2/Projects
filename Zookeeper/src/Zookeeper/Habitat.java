package Zookeeper;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Habitat {
    private String temp;
    private String time;
    private String name;
    private final File file;

    public Habitat(String name) {
        this.name = name;
        file = new File("src/Zookeeper/animals/" + name + ".txt");
    }

    public void printAnimal(){
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

    public void printInfo(){
        double min = 50.0, max = 100.0;
        double weather = min + (Math.random() * ((max - min) + 1));
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        time = currentTime.format(format);

        System.out.println("Current Habitat: " + name);
        System.out.print("Current Time: ");

        int hours1 = (int) time.charAt(0) - '0';
        int hours2 = (int) time.charAt(1) - '0';

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

        time = time + amOrPm;

        if (hours == 0) {
            System.out.print("12");

            for (int i = 2; i < 8; ++i) {
                System.out.print(time.charAt(i));
            }
        } else {
            System.out.print(hours);
            for (int i = 2; i < 8; ++i) {
                System.out.print(time.charAt(i));
            }
        }

        temp = weather + "F";
        System.out.println("Habitat Temp:" + temp);
    }
}

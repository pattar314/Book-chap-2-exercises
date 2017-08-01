package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        out.println("What would you like to do:\n" +
                "1.  celsius to fahrenheit\n" +
                "2.  Volume of cylinder\n" +
                "3.  feet to meters\n" +
                "4.  pounds to kilos\n" +
                "5.  Tip calculator\n" +
                "6.  Sum of digits\n" +
                "7.  Minute converter\n" +
                "8.  Time zone\n" +
                "9.  Acceleration\n" +
                "10. Calculate energy to heat water\n" +
                "11. Population projection\n" +
                "12. Runway length\n" +
                "13. Compound interest\n" +
                "14. BMI counter\n" +
                "15. Distance between rwo points\n" +
                "16. Area of hexagram\n" +
                "19. Windchill\n" +
                "20. Power table\n" +
                "21. Area of triangle\n" +
                "22. Calculate interest\n" +
                "23. Investment/Retirment calculator\n" +
                "24. Cost of driving\n" +
                "==============================================================\n");
        String choice = input.nextLine().toLowerCase();
        switch (choice) {
            case "1":
                out.println("What temp in c do you want converted to f?");
                Double temp = input.nextDouble();
                functions.c2f(temp);
                break;
            case "2":
                out.println("Please enter the radius of cylinder:\n");
                double radius = input.nextDouble();
                out.println("Please enter the length of cylinder:\n");
                double length = input.nextDouble();
                functions.cylVol(radius, length);
                break;
            case "3":
                out.println("How many feet to convert?\n\n");
                double feet = input.nextDouble();
                functions.f2m(feet);
                break;
            case "4":
                out.println("How many pounds do you want to convert");
                double pounds = input.nextDouble();
                functions.pounds2kilo(pounds);
                break;
            case "5":
                out.println("Please enter subtotal\n");
                double subtotal = input.nextDouble();
                out.println("What percent gratuity?\n");
                double gratuity = input.nextDouble();
                functions.tipCalc(subtotal, gratuity);
                break;
            case "6":
                out.println("please enter number");
                int num = input.nextInt();
                functions.sumDigits(num);
                break;
            case "7":
                out.println("PLease enter number of minutes:\n\n");
                int min = input.nextInt();
                functions.numMin(min);
                break;
            case "8":
                out.println("What offset from GMT?\n");
                int offset = input.nextInt();
                functions.timeZone(offset);
                break;
            case "9":
                out.println("Please enter begining velocity in meters per second:");
                double sV = input.nextDouble();
                out.println("Please enter ending velocity in meters per second:");
                double eV = input.nextDouble();
                out.println("Please enter time in seconds:");
                double sec = input.nextDouble();
                functions.acceleration(sV, eV, sec);
                break;
            case "10":
                out.println("How many kilograms of water:\n");
                double kWater = input.nextDouble();
                out.println("What is the initial temperature:\n");
                double startTemp = input.nextDouble();
                out.println("What is the end temperature:\n");
                double endTemp = input.nextDouble();
                functions.calcEnergy(kWater, startTemp, endTemp);
                break;
            case "11":
                out.println("Coming soon");
                break;
            case "12":
                out.println("Please enter take off speed in meters per second:\n");
                double tSpeed = input.nextDouble();
                out.println("Please enter acceleration in meters per second squared:\n");
                double ac = input.nextDouble();
                out.printf("Your runway needs to be %.3f meters long", functions.runwaylength(tSpeed, ac));
                break;
            case "13":


        }
    }
}

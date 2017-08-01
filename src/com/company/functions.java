package com.company;

public class functions {

    public static void c2f(double c) {
        System.out.println("Your converted temp is " + (c * (9.0 / 5.0) + 32));
    }

    public static void cylVol(double radius, double length) {
        double area = radius * radius * 3.14159;
        double volume = area * length;
        System.out.println("Your area is " + area + "\n");
        System.out.println("and your volume is " + volume + "\n");
    }

    public static void f2m(double feet) {
        System.out.println(feet + "feet is " + (feet * 0.305) + " meters.");
    }

    public static void pounds2kilo(double pounds) {
        System.out.println(pounds + " pounds is " + (pounds * 0.454) + " kilos.");

    }

    public static void tipCalc(double subTotal, double gratuity) {
        double tip = (subTotal * (gratuity / 100.00d));
        System.out.println("Total with tip is " + (subTotal + tip) + " and the tip was " + tip);

    }

    public static void sumDigits(int in) {
        String[] inStr = Integer.toString(in).split("");
        int total = 0;
        for (int c = 0; c < inStr.length; c++) {
            total += (Integer.parseInt(inStr[c]));
        }
        System.out.println(total);

    }

    public static void numMin(int min) {
        double hour = min / 60;
        double second = min * 60;
        double day = hour / 24;
        int year = (int) day / 365;
        double yearDay = day % 365;
        System.out.printf(min + " minutes is %.3f seconds, " + min + " minutes, %.3f hours, %.3f days, or " + year +
                " years and " + ((int) day / 365) + " days and " + (int) (hour % 24) + " hours!", second, hour, day, yearDay);
    }

    public static void timeZone(int offset) {
        /*Date date = new Date();
        System.out.println(date.toString());*/
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = (totalHours % (24 + offset));

        // Display results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");

    }

    public static void acceleration(double start, double end, double time) {
        double a = ((end - start) / time);
        System.out.printf("Your acceleration was %.4f meters per second", a);

    }

    public static void calcEnergy(double amountwaterKg, double initTempC, double endTempC) {
        double joules = (amountwaterKg * (endTempC - initTempC) * 4184);
        System.out.printf("You need %.3f joules of energy.", joules);
    }

    public static void population(int years) {

    }

    public static double runwaylength(double takeOffSpeed, double acceleration) {
        double length = ((takeOffSpeed * takeOffSpeed) / (acceleration * 2));
        return length;
    }

    public static void compoundValue(double monthlyAmount, double percent, int months) {

    }

    public static void compBMI(double weightK, double heightM) {

    }

    public static void distancePoints(double x1, double x2, double y1, double y2) {

    }

    public static void hexArea(double sideLength) {

    }

    public static void windChill(double tempF, double speedMi) {

    }

    public static void powerTable(int num) {

    }

    public static void areaTri(double x1, double y1, double x2, double y2, double x3, double y3) {

    }

    public static void calcInterest(double balance, double rate) {

    }

    public static void investmentValue(double amount, double rate, int years) {

    }

    public static void costOfDriving(double distance, double mpg, double ppg) {

    }
}

package lv.acodemy;

import java.net.SocketOption;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Ja u Mami programmist!");
        byte age = 30;
        System.out.println(age);

        short currentYear = 2025;
        short temperatureKelvin = -273;
        short dictance = 1600;

        // int 32 - bit
        int score = 9000;
        int population = 18000000;
        int result = 12 * 12;
        int result1 = (10 * 10) + 1;
        System.out.println(result);

        // long 64-bit
        long starsInGalaxy = 100_000_000L;
        System.out.println(starsInGalaxy);

        // float 32-bit
        float pi = 3.14f;
        float piNumber = (float) Math.PI; // casting
        System.out.println(piNumber);
        float discount = 25.5f;

        // double 64-bit
        double accountBalance = 99999999.9999999422355;
        double squareRoot = Math.sqrt(2);
        double piNumer = Math.PI;
        System.out.println(piNumer);

        // char (symbol)
        char initial = 'N';
        char digit = '7';
        char symbol = '$';

        char smiley = 'u';
        System.out.println(smiley);

        // boolean  (true/false)

        boolean isJavaFun = true;
        boolean isTired = true;
        boolean passed = (40>60); // false

        String fullName = "Antons Mjatiskins";



    }
}

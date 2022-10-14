package src.ru.croc.task2;

import java.util.Scanner;

public class Main {

    public static void formatting(long numberInByte) {
        int i = -1;
        long checkingNumber = numberInByte;
        while (checkingNumber > 0) {
            checkingNumber = checkingNumber / 1024;
            i = i + 1;
        }
        double finalNumber = numberInByte;
        finalNumber /= (Math.pow(1024, i));
        String finalNumberFormatted = String.format("%.1f", finalNumber);
        switch (i) {
            case (0):
                System.out.println(finalNumberFormatted + "B");
                break;
            case (1):
                System.out.println(finalNumberFormatted + "KB");
                break;
            case (2):
                System.out.println(finalNumberFormatted + "MB");
                break;
            case (3):
                System.out.println(finalNumberFormatted + "ГB");
                break;
            case (4):
                System.out.println(finalNumberFormatted + "TB");
                break;
            default:
                System.out.println(finalNumberFormatted + " * 1024^" + i + " B");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        long numberInByte = 0;
        System.out.print("Введите число в байтах: ");
        numberInByte = keyboard.nextLong();

        formatting(numberInByte);
    }
}
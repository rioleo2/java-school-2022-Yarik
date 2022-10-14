package src.ru.croc.task2;

import java.util.Scanner;

public class main {

    public static void formatting(long number_in_byte) {
        int i = -1;
        long checking_number = number_in_byte;
        while (checking_number > 0) {
            checking_number = checking_number / 1024;
            i = i+1;
        }
        double final_number = number_in_byte;
        final_number /= (Math.pow(1024, i));
        String final_number_formatted = String.format("%.1f", final_number);
        switch (i) {
            case (0):
                System.out.println(final_number_formatted + "B");
                break;
            case (1):
                System.out.println(final_number_formatted + "KB");
                break;
            case (2):
                System.out.println(final_number_formatted + "MB");
                break;
            case (3):
                System.out.println(final_number_formatted + "ГB");
                break;
            case(4):
                System.out.println(final_number_formatted + "TB");
                break;
            default:
                System.out.println(final_number_formatted + "1024^"+ i + " B");
                break;
        }
    }

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        long number_in_byte = 0;
        System.out.print("Введите число в байтах: ");
        number_in_byte = keyboard.nextLong();

        formatting(number_in_byte);
    }
}
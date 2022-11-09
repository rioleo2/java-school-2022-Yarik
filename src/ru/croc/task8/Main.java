package src.ru.croc.task8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int numberOfWords = 0;

        try (Scanner keyboard = new Scanner(new FileReader(args[0]))) {
            while (keyboard.hasNextLine()) {
                if (!keyboard.next().equals("\n"))
                    numberOfWords += keyboard.nextLine().split("\s+").length; //к счетчику numberOfWords прибавляется
                                                                                //длина строки, разделенная одним
                                                                                //или несколькими пробелами
                                                                                //(\s+ - метасимвол пробела или
                                                                                //последовательности пробелов)
            }
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Number of words in file: " + numberOfWords);
    }
}

package src.ru.croc.task9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String enteredPath = keyboard.nextLine();

        String[] splittedPath = enteredPath.split("/");

        int i = 0;
        while (i < splittedPath.length) {
            if (splittedPath[i] != null && splittedPath[i].equals(".")) //удаляем лишние .
                splittedPath[i] = null;
            if (splittedPath[i] != null && splittedPath[i].equals("..")) {
                for (int j = i - 1; j >= 0; j--) { //удаляем "хвост" из директорий
                    splittedPath[i] = null;
                    splittedPath[j] = null;
                }
            }
            else
                i++;
        }

        ArrayList<String> normalizedPathList = new ArrayList<>(); //создаем лист из директорий без лишних переходов

        for (String string : splittedPath)
            if (string != null)
                normalizedPathList.add(string);

        String normalizedPathString = String.join("/", normalizedPathList); /*разделяем элементы листа слешем
                                                                                      и создаем из этого строку*/
        System.out.println(normalizedPathString);
    }
}

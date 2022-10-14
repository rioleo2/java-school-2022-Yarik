package src.ru.croc.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Point {
        double x;
        double y;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int t = 0;
        System.out.print("Введите количество граней у многоугольника: ");
        t = keyboard.nextInt();

        List<Point> pointList = new ArrayList<Point>(t);

        for (int i = 0; i < t; i++) {
            Point p = new Point();
            pointList.add(p);
            System.out.print("Введите координату х вершины №" + (i + 1) + ": ");
            pointList.get(i).x = keyboard.nextInt();
            System.out.print("Введите координату y вершины №" + (i + 1) + ": ");
            pointList.get(i).y = keyboard.nextInt();
        }

        double area = 0;
        double nedoArea = 1; //вспомогательная переменная для поиска площади
        double perimetr = 0;
        double halfPerimetr = 0;

        double[] arrayOfSides = new double[t];

        //цикл ниже считает расстояния между двумя различными точками и записывает их в массив arrayOfSides
        for (int j = 0; j < t; j++) {

            if (j == t - 1) {
                arrayOfSides[j] = Math.sqrt(Math.pow((pointList.get(j).x - pointList.get(0).x), 2)
                        + Math.pow((pointList.get(j).y - pointList.get(0).y), 2));
            } else {
                arrayOfSides[j] = Math.sqrt(Math.pow((pointList.get(j + 1).x - pointList.get(j).x), 2)
                        + Math.pow((pointList.get(j + 1).y - pointList.get(j).y), 2));
            }

        }

        for (int k = 0; k < t; k++) {
            perimetr += arrayOfSides[k];
        }
        halfPerimetr = perimetr / 2;
        for (int g = 0; g < t; g++) {
            nedoArea *= halfPerimetr - arrayOfSides[g];
        }
        area = Math.sqrt(halfPerimetr * nedoArea);   //допустим, площадь всех многоугольников
                                                     //считается по формуле Герона :)
        String resultArea = String.format("%.1f",area); //форматируем вывод
        System.out.println("Площадь " + t + "-угольника: " + resultArea);
    }
}
package src.ru.croc.task1;

import java.util.Scanner;

public class main {

    static class Point {
        double x;
        double y;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Point first = new Point();
        System.out.print("Введите координату х вершины №1: ");
        first.x = keyboard.nextDouble();
        System.out.print("Введите координату y вершины №1: ");
        first.y = keyboard.nextDouble();

        Point second = new Point();
        System.out.print("Введите координату х вершины №2: ");
        second.x = keyboard.nextDouble();
        System.out.print("Введите координату y вершины №2: ");
        second.y = keyboard.nextDouble();

        Point third = new Point();
        System.out.print("Введите координату х вершины №3: ");
        third.x = keyboard.nextDouble();
        System.out.print("Введите координату х вершины №3: ");
        third.y = keyboard.nextDouble();

        double area = 0;
        double half_perimetr = 0;
        double a,b,c = 0;  //the lengths of the sides of the triangle

        a = Math.sqrt(Math.pow((second.x-first.x),2)+Math.pow((second.y-first.y),2));
        b = Math.sqrt(Math.pow((third.x-second.x),2)+Math.pow((third.y-second.y),2));
        c = Math.sqrt(Math.pow((third.x-first.x),2)+Math.pow((third.y-first.y),2));

        half_perimetr = (a+b+c)/2;
        area = (Math.sqrt(half_perimetr*(half_perimetr-a)*(half_perimetr-b)*(half_perimetr-c)));
        String result_area = String.format("%.1f",area);

        System.out.println("Площадь треугольника: " + result_area);
    }
}
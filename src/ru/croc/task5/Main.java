package src.ru.croc.task5;

import src.ru.croc.task5.figures.Circle;
import src.ru.croc.task5.figures.Rectangle;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(100, 100, 150, 200);
        Circle circle = new Circle(100, 100, 10);

        Annotation annotationRectangle = new Annotation(rectangle, "iAmLabelInRectangleSelection");
        Annotation annotationCircle = new Annotation(circle, "iAmLabelInCircleSelection");

        System.out.println(rectangle);
        System.out.println(annotationRectangle + "\n");

        System.out.println(circle);
        System.out.println(annotationCircle + "\n");

        System.out.println("Сместили координаты прямоугольника и круга " + "\n");

        rectangle.move(1000, 1000);
        circle.move(-300, -300);

        System.out.println(annotationRectangle);
        System.out.println(annotationCircle);

    }
}

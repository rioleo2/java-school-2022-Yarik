package src.ru.croc.task3;
import java.util.Scanner;

/*
При решении задачи определил 6 методов:
-Для рандомной инициализации массива
-Для инициализации массива через пробел
-Для вывода массива в консоль
-Для поиска минимума
-Для поиска максимума
-Для перестановки чисел (минимум ставится в начало, максимум - в конец)
 */

public class Main {


    public static void initRandomArray(int[] array, int sizeOFArray){

        for (int i = 0; i < sizeOFArray; i++){
            array[i] = (int)(Math.random()*((100-1)+1))+1;
        }
    }

    public static void initArray(int[] array, int sizeOFArray){

        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < sizeOFArray; i++){
            array[i] = keyboard.nextInt();
        }
    }

    public static void printArray(int[] array, int sizeOFArray){
        for (int i = 0; i < sizeOFArray; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static int findMin(int[] array, int sizeOFArray){

        int min = array[0];

        for (int i = 0; i < sizeOFArray; i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;
    }

    public static int findMax(int[] array, int sizeOFArray){

        int max = array[0];

        for(int i = 0; i < sizeOFArray; i++){
            if (array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    //при наличии нескольких минимумов/максимумов swapNumbers меняет местами первый попавшийся минимум/максимум
    public static int[] swapNumbers(int[] array, int sizeOFArray, int min, int max){

        int tempOne = 0; //вспомогательные переменные для перемены чисел в массиве
        int tempTwo = 0;
        for(int i = 0; i < sizeOFArray; i++){
            if (array[i] == min){
                tempOne = array[i];
                array[i] = array[0];
                array[0] = tempOne;
                break;
            }
        }

    for (int i = 0; i < sizeOFArray; i++){
            if (array[i] == max){
                tempTwo = array[i];
                array[i] = array[sizeOFArray-1];
                array[sizeOFArray-1] = tempTwo;
                break;
            }
        }
        return array;
    }

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        int sizeOfArray = 0;
        sizeOfArray = keyboard.nextInt();

        int[] array = new int[sizeOfArray];

        initRandomArray(array, sizeOfArray);

        System.out.println("Изначальный массив: ");
        printArray(array, sizeOfArray);

        int min = 0;
        int max = 0;

        min = findMin(array, sizeOfArray);
        max = findMax(array,sizeOfArray);

        array = swapNumbers(array, sizeOfArray, min, max);

        System.out.println("Измененный массив: ");
        printArray(array, sizeOfArray);

    }
}

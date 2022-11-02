package src.ru.croc.task7.chess;

public class IllegalPositionException extends Exception{
    @Override
    public String getMessage() {
        return "Вы ввели неверную позицию. Позиция должна быть в интервале 0-7 и a-h";
    }
}

package src.ru.croc.task7.chess;

public class IllegalMoveException extends Exception {
    final private ChessPosition from;
    final private ChessPosition to;

    public IllegalMoveException(ChessPosition from, ChessPosition to) {
        this.from = from;
        this.to = to;
    }
    @Override
    public String getMessage() {
        return "Данная фигура не может так ходить: " + from + " -> " + to;
    }
}

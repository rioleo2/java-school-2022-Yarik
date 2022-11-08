package src.ru.croc.task7;

import src.ru.croc.task7.chess.ChessPosition;
import src.ru.croc.task7.chess.IllegalMoveException;
import src.ru.croc.task7.chess.IllegalPositionException;

public class Main {
    public static void main(String[] args) throws IllegalPositionException, IllegalMoveException {
        String[] firstSeries = {"g8", "e7", "e6"};
        String[] secondSeries = {"g8", "e7", "c8"};

        //ChessPosition.checkingCorrectnessOfSeriesOfKnightMoves(firstSeries);  -> IllegalMoveException
        ChessPosition.checkingCorrectnessOfSeriesOfKnightMoves(secondSeries);
    }

}

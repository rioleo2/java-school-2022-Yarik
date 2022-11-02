package src.ru.croc.task7.chess;

public class ChessPosition {
    private final int x;
    private final int y;

    public ChessPosition(int x, int y) throws IllegalPositionException {
        if ((x < 0 || x > 7) && (y < 0 || y > 7)) {
            throw  new IllegalPositionException();
        }
        this.x = x;
        this.y = y;
    }

    private char convertingNumberToLetter(int number) throws IllegalPositionException {
        return switch (number) {
            case 0 -> 'a';
            case 1 -> 'b';
            case 2 -> 'c';
            case 3 -> 'd';
            case 4 -> 'e';
            case 5 -> 'f';
            case 6 -> 'g';
            case 7 -> 'h';
            default -> throw new IllegalPositionException();
        };
    }

    private static int convertingLetterToNumber(char letter) throws IllegalPositionException {
        return switch (letter) {
            case 'a' -> 0;
            case 'b' -> 1;
            case 'c' -> 2;
            case 'd' -> 3;
            case 'e' -> 4;
            case 'f' -> 5;
            case 'g' -> 6;
            case 'h' -> 7;
            default -> throw new IllegalPositionException();
        };
    }
}

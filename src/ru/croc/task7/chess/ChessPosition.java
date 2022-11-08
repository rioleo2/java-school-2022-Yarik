package src.ru.croc.task7.chess;

public class ChessPosition {
    private final int x;
    private final int y;

    public ChessPosition(int x, int y) throws IllegalPositionException {
        if ((x < 0 || x > 7) && (y < 0 || y > 7)) {
            throw new IllegalPositionException();
        }
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }

    public static ChessPosition parse(String position) throws IllegalPositionException {
        return new ChessPosition(position.charAt(0) - 'a', /*position.charAt(0) вернет код символа в UTF-16
                                                          чтобы получить число от 0 до 7 мы вычитаем код символа 'a'*/
                Character.getNumericValue(position.charAt(1)-1)); /*вычитаем 1, т.к. шахматная нотация
                                                                             использует числа от 1 до 8, а класс
                                                                         ChessPosition работает с индексами от 0 до 7*/

    }

    public static boolean checkingCorrectnessOfKnightMove(ChessPosition from, ChessPosition to)
                                                                                         throws IllegalMoveException {
        if    ((Math.abs(from.getX() - to.getX()) == 1 && Math.abs(from.getY() - to.getY()) == 2) ||
                Math.abs(from.getX() - to.getX()) == 2 && Math.abs(from.getY() - to.getY()) == 1)
             return true; //проверяем, что фигура ходит буквой Г (ㄱ)
        else throw new IllegalMoveException(from, to);
    }

    public static void checkingCorrectnessOfSeriesOfKnightMoves(String... positions) throws IllegalMoveException,
                                                                                            IllegalPositionException {
        for (int i = 0; i < positions.length - 1; i++) {
            ChessPosition from = ChessPosition.parse(positions[i]);
            ChessPosition to = ChessPosition.parse(positions[i + 1]);
            if (!checkingCorrectnessOfKnightMove(from, to)) {
                throw new IllegalMoveException(from, to);
            }
        }
        System.out.println("OK");
    }

    @Override
    public String toString() {
        return Character.toString('a' + x) + (y + 1);
    }

}

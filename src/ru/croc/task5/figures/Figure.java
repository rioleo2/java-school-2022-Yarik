package src.ru.croc.task5.figures;

public abstract class Figure {
    public abstract boolean checkIfPointIsInSelection(int x, int y);
    public abstract void move(int dx, int dy);
}

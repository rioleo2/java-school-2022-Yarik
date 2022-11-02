package src.ru.croc.task5.figures;

public class Rectangle extends Figure {
    private int x1; // x координата левого нижнего угла
    private int y1; // y координата левого нижнего угла
    private int x2; // x координата правого верхнего угла
    private int y2; // y координата правого верхнего угла

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public void setX2(int x2) {
        this.x2= x2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }
    public int getY1() {
        return y1;
    }
    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }

    @Override
    public boolean checkIfPointIsInSelection(int x, int y) {
        return (x >= x1 && x <= x2) && (y >= y1 && y <= y2);
    }

    @Override
    public String toString() {
        return "R " + "(" + x1 + ", " + y1 + ") " + "(" + x2 + ", " + y2 + ")";
    }

    @Override
    public void move(int dx, int dy) {
        this.x1 += dx;
        this.y1 += dy;

        this.x2 += dx;
        this.y2 += dy;
    }

}

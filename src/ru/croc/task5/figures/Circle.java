package src.ru.croc.task5.figures;

public class Circle extends Figure {
    private int x0;
    private int y0;
    private int r;

    public Circle(int x0, int y0, int r) {
        this.x0 = x0; // х координата центра
        this.y0 = y0; // y координата центра
        this.r = r;   // r радиус окружности
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }
    public void setY0(int y0) {
        this.y0 = y0;
    }
    public void setR(int r) {
        this.r = r;
    }

    public int getX0() {
        return x0;
    }
    public int getY0() {
        return y0;
    }
    public int getR() {
        return r;
    }

    @Override
    public String toString() {
        return "C " + "(" + x0 + ", " + y0 + "), " + r;
    }

    @Override
    public boolean checkIfPointIsInSelection(int x, int y) {   //(x-x0)² + (y-y0)² <= r²
        return   ((int)Math.pow((x - x0),2)
                + (int)Math.pow((y - y0),2)
                    <= Math.pow(r,2));
    }

    @Override
    public void move(int dx, int dy) {
        this.x0 += dx;
        this.y0 += dy;
    }
}

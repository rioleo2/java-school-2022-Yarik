package src.ru.croc.task5;

import src.ru.croc.task5.figures.Figure;

public class Annotation {
    private Figure figure;
    private String label;

    public Annotation(Figure figure, String label) {
        this.figure = figure;
        this.label = label;
    }

    public Figure getFigure() {
        return figure;
    }

    public boolean containsLabel(String enteredLabel) {
        return label.contains(enteredLabel);
    }

    @Override
    public String toString() {
        return figure + ": " + label;
    }
}

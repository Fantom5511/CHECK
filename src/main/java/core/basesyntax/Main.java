package core.basesyntax;

public class Main {
    private static final int ARRAYSIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[ARRAYSIZE];
        for (int i = 0; i < figureArray.length; i++) {
            if (i < figureArray.length / 2) {
                figureArray[i] = figureSupplier.getRandomFigure();
                figureArray[i].drow();
            } else {
                figureArray[i] = figureSupplier.getDefaultFigure();
                figureArray[i].drow();
            }
        }

    }
}

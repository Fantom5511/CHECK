package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXFIGURECOUNT = 5;
    private static final int MAXSIZE = 20;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int value = random.nextInt(MAXFIGURECOUNT);
        switch (value) {
            case 1:
                return getRandomCircle();

            case 2:
                return getRandomIsoscelesTrapezoid();

            case 3:
                return getRandomRectangle();

            case 4:
                return getRandomRightTriangle();

            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAXSIZE));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAXSIZE),
                random.nextInt(MAXSIZE),
                random.nextInt(MAXSIZE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAXSIZE),
                random.nextInt(MAXSIZE));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAXSIZE),
                random.nextInt(MAXSIZE));
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAXSIZE));
    }
}

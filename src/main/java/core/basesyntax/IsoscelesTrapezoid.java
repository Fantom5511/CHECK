package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int squareCounter = 2;
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double areaCount() {
        return ((sideA * sideB) / squareCounter) * height;
    }

    @Override
    public String drow() {
        return "Figure: isoscelestrapezoid, area: "
                + areaCount() + " sq.units, sideA: "
                + sideA + " units, sideB: "
                + sideB + " units, height: "
                + height + " units, color: "
                + getColor();
    }
}

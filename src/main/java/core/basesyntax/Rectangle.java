package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double areaCount() {
        return firstSide * secondSide;
    }

    @Override
    public String drow() {
        return "Figure: rectangle, area: "
                + areaCount() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: "
                + secondSide + " units, color: "
                + getColor();
    }
}

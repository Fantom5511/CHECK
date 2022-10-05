package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double areaCount() {
        return side * side;
    }

    @Override
    public String drow() {
        return "Figure: righttriangle, area: "
                + areaCount() + " sq.units, side: "
                + side + " units, color: "
                + getColor();
    }
}

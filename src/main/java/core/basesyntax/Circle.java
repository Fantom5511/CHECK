package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double areaCount() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String drow() {
        return "Figure: circle, area: "
                + areaCount() + " sq.units, radius: "
                + radius + " units, color: "
                + getColor();
    }
}

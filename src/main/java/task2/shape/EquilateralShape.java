package task2.shape;

public abstract class EquilateralShape {
    protected final int length;

    protected EquilateralShape(int length) {
        this.length = length;
    }

    public abstract String draw();
}
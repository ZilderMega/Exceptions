package task2.shape;

public class EquilateralTriangle extends EquilateralShape {

    public EquilateralTriangle(int length) {
        super(length);
    }

    @Override
    public String draw() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            result.append(" ".repeat(length - i))
                    .append('/')
                    .append(" ".repeat(i * 2))
                    .append('\\')
                    .append('\n');
        }

        return result.append(' ')
                .append("--".repeat(length))
                .toString();
    }
}

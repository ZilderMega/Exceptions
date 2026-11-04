package task2.shape;

public class Square extends EquilateralShape {

    public Square(int length) {
        super(length);
    }

    @Override
    public String draw() {
        StringBuilder result = new StringBuilder();

        String border = " " + "-".repeat(length) + " ";
        result.append(border).append('\n');

        for (int i = 0; i < length; i++) {
            result.append('|')
                    .append(" ".repeat(length))
                    .append('|')
                    .append('\n');
        }

        return result.append(border).toString();
    }
}

package task2;

import task2.shape.EquilateralShape;
import task2.shape.EquilateralTriangle;
import task2.shape.InputValidationException;
import task2.shape.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину стороны: ");
        if (!scanner.hasNextInt()) {
            throw new InputValidationException("Некорректная длина: требуется целое число");
        }

        int length = scanner.nextInt();

        if (length <= 0) {
            throw new InputValidationException("Некорректная длина: число должно быть положительным");
        }

        System.out.print("Выберите фигуру (1 — квадрат, 2 — треугольник): ");

        if (!scanner.hasNextInt()) {
            throw new InputValidationException("Некорректный тип фигуры: выберите 1 или 2");
        }

        int type = scanner.nextInt();

        EquilateralShape shape;

        if (type == 1) {
            shape = new Square(length);
        } else if (type == 2) {
            shape = new EquilateralTriangle(length);
        } else {
            throw new InputValidationException("Некорректный тип фигуры: выберите 1 или 2");
        }

        System.out.println(shape.draw());
    }
}

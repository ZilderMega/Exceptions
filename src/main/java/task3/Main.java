package task3;

import task3.animals.*;
import task3.exceptions.ArrayValidationException;
import task3.exceptions.UnknownAnimalException;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Fish(), new Cow(), null};
        try {
            soundAll(animals);
        }
        catch (ArrayValidationException e) {
            System.out.println(e.getMessage());
        }
        catch (UnknownAnimalException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void soundAll(Animal[] animals) throws ArrayValidationException,
            UnknownAnimalException {
        nullChek(animals);
        for (Animal animal : animals) {
            sound(animal);
        }
    }


    public static void sound(Animal animal) throws UnknownAnimalException {

        if (animal.getClass() == Cat.class) {
            ((Cat) animal).meow();
        } else if (animal.getClass() == Dog.class) {
            ((Dog) animal).woof();
        } else if (animal.getClass() == Cow.class) {
            ((Cow) animal).moo();
        } else {
            throw new UnknownAnimalException("Неизвестное животное");
        }
    }

    private static void nullChek(Animal[] animals) {
        int index = 0;
        for (Animal animal : animals) {
            if (animal == null) {
                throw new ArrayValidationException("Животное в массиве не может быть null! " +
                        "Индекс элемента: " + index);
            }
            index += 1;
        }
    }
}

package filesystemvariant2;

import filesystemvariant2.filevariant.File;
import filesystemvariant2.filevariant.FileType;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File[] files = {
                new File("Текст", 20, FileType.TEXT),
                new File("Изображение", 1000, FileType.IMAGE),
                new File("Аудио", 500, FileType.AUDIO),
                new File("Видео", 123000, FileType.VIDEO)};

        Scanner scanner = new Scanner(System.in);
        String foundFile = scanner.nextLine();
        scanner.close();
        File file = returnFile(files, foundFile);
        System.out.println(file.toString());

    }


    public static File returnFile(File[] files, String foundFile) throws FileNotFoundException {
        for (File element : files) {
            if (foundFile.equals(element.getName())) {
                return element;
            }
        }

        throw new FileNotFoundException("Файл не найден!");
    }
}



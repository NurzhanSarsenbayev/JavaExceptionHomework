package task1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileHandler {

    public void handleFile(Path filePath, String[] inputArray) throws IOException{

        // Проверяем существование файла
        if (!Files.exists(filePath)) {
            try {
                // Создаем новый файл
                Files.createFile(filePath);
            } catch (IOException e) {
                System.err.println("Ошибка при создании файла:");
                e.printStackTrace();
                return;
            }
        }

        try(FileWriter writer = new FileWriter(filePath.toFile(), true)){
            String output = String.format("%s %s %s %s %s %s%n", inputArray[0],
                    inputArray[1],inputArray[2],inputArray[3],inputArray[4],inputArray[5]);
            writer.write(output);
            System.out.println("Ваши данные записаны");
        }catch (IOException e) {
            System.err.println("Ошибка при записи данных в файл:");
            e.printStackTrace();
        }
    }
}


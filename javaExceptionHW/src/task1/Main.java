package task1;


import java.nio.file.Path;
import java.nio.file.Paths;

// Иван Иванович Чернов 01.01.1945 77777777777 m
// Используйте, как шаблон для проверки
// Можете изменять, для проверока на ошибки

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        InputValidation inputValidation = new InputValidation();
        FileHandler fileHandler = new FileHandler();
        try {
            String input = userInput.getUserInput();
            String[] inputArray = input.split(" ");

            inputValidation.validateUserInput(inputArray);

            Path path = Paths.get("Spisok.txt");
            fileHandler.handleFile(path, inputArray);
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

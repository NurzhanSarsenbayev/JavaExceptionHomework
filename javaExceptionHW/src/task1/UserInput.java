package task1;

import java.util.Scanner;

public class UserInput {
    Scanner scan = new Scanner(System.in);
    public String getUserInput() {
        System.out.println("Введите ФИО Дату рождения Телефон Пол\nИспользуйте правильный формат" +
                "\n<Фамилия> <Имя> <Отчество> <датарождения> <номертелефона> <пол>" +
                "\nДата рождения: дд.мм.гггг, Телефон: 77777777777 Пол: m или f\n" +
                "Данные должны быть разделены пробелом\n" +
                "В случае неправильного формата будет ошибка");

        return scan.nextLine();
    }
}

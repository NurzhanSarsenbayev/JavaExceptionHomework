package task1;
public class InputValidation {

    public void validateUserInput(String[] inputArray) {
        //Общая проверка
        if (inputArray.length != 6) {
            throw new IllegalArgumentException("Неверное количество данных");
        }

        //Проверяем на правильность написания даты
        if (!inputArray[3].matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new IllegalArgumentException("Неверный формат даты рождения. Используйте dd.mm.yyyy");
        }
        String[] dOB = inputArray[3].split("\\.");
        int[] dOBInt = new int[3];
        for (int i = 0; i < dOB.length; i++) {
            dOBInt[i] = Integer.parseInt(dOB[i]);
        }

        if (dOBInt[0] > 31 || dOBInt[1] > 12)
            throw new IllegalArgumentException("Некорректная дата рождения");

        if (dOBInt[0] == 31 && (dOBInt[1] == 2 || dOBInt[1] == 4 || dOBInt[1] == 6 ||
                dOBInt[1] == 9 || dOBInt[1] == 11))
            throw new IllegalArgumentException("В этом месяце не может быть столько дней");

        if (dOBInt[0] > 29 && dOBInt[1] == 2)
            throw new IllegalArgumentException("В феврале не может быть столько дней");


        //Проверяем на правильность написания номера телефона
        try {
            long phone = Long.parseLong(inputArray[4]);

        } catch (NumberFormatException e) {
            throw new NumberFormatException("В номере телефона должны быть только цифры");
        }

        //Проверяем на правильность написания пола
        if (inputArray[5].length() > 1)
            throw new IllegalArgumentException("Неправильный формат ввода в графе пола. Нужна одна буква: 'f' или 'm'");
        char[] charArray = inputArray[5].toLowerCase().toCharArray();

        if (charArray[0] != 'f' && charArray[0] != 'm') {
            throw new IllegalArgumentException("Неверный символ пола. Используйте 'f' или 'm'.");
        }
    }
}

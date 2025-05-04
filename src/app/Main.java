package app;

public class Main {

    public static void main(String[] args) {
//Створюємо об'єкти класів DataProvider та DataHandler, щоб отримати доступ до даних та обробити дані
        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();
// Обробка масиву даних найменувань товарів
        //provider.getProductNames() - повертаємо масив продуктів, dataHandler.handleData(...) - обробляємо цей масив
        //namesOutput - зберігаємо текст
        String namesOutput = dataHandler.handleData(provider.getProductName());
        getOutput("Products: " + namesOutput);
//Аналогічно обробляємо масив даних про суму продажів
        String salesOutput = dataHandler.handleData(provider.getSalesAmounts());
        getOutput("Sales, EUR: " + salesOutput);
    }

    //Виводимо результат роботи програми
    private static void getOutput(String output) {
        System.out.println(output);
    }

}

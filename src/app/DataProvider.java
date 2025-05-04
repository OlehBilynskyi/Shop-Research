package app;

public class DataProvider {
    //Повертаємо створений масив із 5 назв продуктів
    public String[] getProductName() {
        return new String[]{"apple", "grape", "mango", "apple", "orange"};
    }

    //Повертаємо створений масив з 5 сумами продажів
    public Double[] getSalesAmounts() {
        return new Double[]{1520.89, 2058.35, 1807.29, 899.99, 1924.25};
    }
}

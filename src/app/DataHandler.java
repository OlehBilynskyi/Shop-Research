package app;

public class DataHandler {
    //<T> - узагальнення(generics), означає що метод може працювати з будь-яким типом (String, Double, Integer,...)
    //String - метод який повертає рядок(String); T[] items - параметр: масив елементів типу T
    public <T> String handleData(T[] items) {
        //Створюємо об'єкт StringBuilder, щоб будувати рядок через додавання частин тексту
        StringBuilder sb = new StringBuilder();
        //Додаємо змінну для нумерації кожного елементу
        int count = 0;
        //Цикл for-each - перебираємо кожен елемент item з масиву items
        for (T item : items) {
            count++; //+1
            //String.format - форматуємо рядок; sb.append - додаємо текст до загального рядка
            sb.append(String.format("(%d) %s ", count, item));
        }
        //Перетворюємо StringBuilder у звичайний String
        //.trim() - видаляємо в кінці пробіл
        return sb.toString().trim();
    }
}

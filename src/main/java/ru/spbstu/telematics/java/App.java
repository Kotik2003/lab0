package ru.spbstu.telematics.java;

public class App {
    public static void main(String[] args) {
        // Задаем векторы
        int[] vector1 = {5, 2};
        int[] vector2 = {4, -1};

        // Вычисляем скалярное произведение
        int scalarProduct = calculateScalarProduct(vector1, vector2);

        // Выводим результат
        System.out.println("Скалярное произведение векторов: " + scalarProduct);
    }

    // Метод для вычисления скалярного произведения
    public static int calculateScalarProduct(int[] vector1, int[] vector2) {
        // Проверка на совпадение размеров векторов
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Векторы должны иметь одинаковую длину");
        }

        int result = 0;
        for (int i = 0; i < vector1.length; i++) {
            result += vector1[i] * vector2[i];
        }
        return result;
    }
}
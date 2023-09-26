import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float number = readFloat();
        System.out.println("Введенное число: " + number);
    }
    
    public static float readFloat() {
        Scanner scanner = new Scanner(System.in);
        float input;
        while (true) {
            System.out.print("Введите дробное число: ");
            try {
                input = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введено некорректное число. Попробуйте еще раз.");
            }
        }
        return input;
    }
}

// В этом примере метод readFloat считывает введенное значение с помощью класса Scanner.
// Затем оно парсится в тип float с помощью метода Float.parseFloat(). Если введено некорректное число,
// ловится исключение NumberFormatException и выводится сообщение о некорректном вводе.
// Цикл повторяется, пока не будет введено корректное число.

// Метод readFloat возвращает введенное значение типа float, а затем в методе main оно просто выводится на экран.
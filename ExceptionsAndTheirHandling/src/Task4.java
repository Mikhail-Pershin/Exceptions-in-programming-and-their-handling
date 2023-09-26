import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            String input = readString();
            System.out.println("Введенная строка: " + input);
        } catch (EmptyStringException e) {
            System.out.println("Пустые строки вводить нельзя.");
        }
    }
    
    public static String readString() throws EmptyStringException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new EmptyStringException();
        }
        return input;
    }
}

class EmptyStringException extends Exception {
}

// В этой программе создается пользовательское исключение EmptyStringException,
//  которое будет выбрасываться, когда пользователь вводит пустую строку. 

// Метод readString считывает введенную строку с помощью класса Scanner, а затем проверяет,
//  является ли введенная строка пустой. Если введена пустая строка, выбрасывается исключение EmptyStringException. 

// В методе main вызывается метод readString в блоке try-catch,
//  чтобы обработать исключение EmptyStringException и вывести сообщение о невозможности ввода пустой строки.
//   Если введена непустая строка, она выводится на экран.
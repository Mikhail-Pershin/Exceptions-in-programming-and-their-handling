import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * В main методе происходит обработка ввода пользователя, проверка на корректное количество данных и их формат, 
 * создание объекта Person, запись данных в файл с использованием класса BufferedWriter.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в формате: Фамилия Имя Отчество ДатаРождения НомерТелефона Пол(f or m)");

        String input = scanner.nextLine();

        String[] data = input.split(" ");

        if (data.length != 6) {
            System.out.println("Ошибка: вы ввели неверное количество данных.");
            return;
        }

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String dateOfBirth = data[3];
        long phoneNumber;
        char gender;

        try {
            phoneNumber = Long.parseLong(data[4]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат номера телефона.");
            return;
        }

        if (data[5].length() != 1 || (!data[5].equals("f") && !data[5].equals("m"))) {
            System.out.println("Ошибка: неверный формат пола.");
            return;
        }

        gender = data[5].charAt(0);

        Person person = new Person(lastName, firstName,  middleName, dateOfBirth, phoneNumber, gender);
         
        String filename = lastName + ".txt";
        
        

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            String fileContent = "<" +  person.getLastName() + 
                    "><" +
                    person.getFirstName() +
                    "><" +
                    person.getMiddleName() +
                    "><" +
                    person.getDateOfBirth() +
                    "><" +
                    person.getPhoneNumber() +
                    "><" +
                    person.getGender() + 
                    ">";
             
             
            writer.write(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Данные успешно записаны в файл " + filename);
    }
}

/*
 * Класс InvalidDataFormatException является пользовательским исключением, которое используется для обработки ошибок формата данных
 */
class InvalidDataFormatException extends Exception {
    public InvalidDataFormatException(String message) {
        super(message);
    }
}
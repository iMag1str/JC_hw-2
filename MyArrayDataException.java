/**
 * Java Core. HomeWork 2
 *
 * @author Mark
 * @version 07.11.2021
 */
public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int row, int col) {
        super(String.format("Invalid cell value %dx%d - it cannot be converted to cell number, sry...", row, col));
    }
}
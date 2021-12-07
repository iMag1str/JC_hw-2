/**
 * Java Core. HomeWork 2
 *
 * @author Mark
 * @version 07.11.2021
 */
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        System.out.println("JC_Home work #2");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        int s;
        s = arreySize();
        System.out.println();
        String[][] arr = new String[s][s];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter your desired cell value " + (i + 1) + " x " + (j + 1) + " - ");
                arr[i][j] = sc.nextLine();
            }
        }
        sc.close();
        System.out.println();
        for (int i=0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "      ");
            }
            System.out.println();
        }
        try {
            int r = transferToNumberAndCounting(arr);
            System.out.println("The sum of all cells is - " + r);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
    
    public static int arreySize() {
        Scanner size = new Scanner(System.in);
        System.out.print("Enter the desired size of the array - ");
        int q;
        q = size.nextInt();
        return q;
    }

    public static int transferToNumberAndCounting(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        System.out.println();
        for (int w = 0; w < arr.length; w++) {
            if (arr[w].length != 4) {
                throw new MyArraySizeException("Invalid cell value, sry...");
            }
            for (int l = 0; l < arr.length; l++) {
                if (arr[l].length != 4) {
                    throw new MyArraySizeException("Invalid cell value, sry...");
                }
                try {
                    count += Integer.parseInt(arr[w][l]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException((w + 1), (l + 1));
                }
            }
        }
        return count;
    }
}
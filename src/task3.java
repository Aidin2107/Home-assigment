 import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner Scan = new Scanner(System.in);
        System.out.print("Original:");
        for (int x : numbers) System.out.print(" " + x);
        System.out.println();
        System.out.print("Enter index to remove: ");
        int index = Scan.nextInt();
        for (int i = index; i < numbers.length - 1; i++)
            numbers[i] = numbers[i + 1];
        System.out.print("Updated:");
        for (int i = 0; i < numbers.length - 1; i++)
            System.out.print(" " + numbers[i]);
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {
        int[] array = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};
        int a = 0;
        System.out.print("Original:");
        for (int x : array) System.out.print(" " + x);
        System.out.println();
        for (int i = 0; i < array.length; i++)
            if (array[i] < 0) { array[i] = 0; a++; }
        System.out.print("Modified:");
        for (int x : array) System.out.print(" " + x);
        System.out.println();
        System.out.println("Replacements: " + a);
    }
}






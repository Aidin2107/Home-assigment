public class task2 {
    public static void main(String[] args) {
        int[] array = {10, 25, 8, 30, 15, 30};
        int largest = array[0];
        for (int x : array)
            if (x > largest) largest = x;
        int second = largest;
        for (int x : array)
            if (x < largest && (second == largest || x > second)) second = x;
        System.out.print("Array:");
        for (int x : array) System.out.print(" " + x);
        System.out.println();
        System.out.println("Largest: " + largest);
        if (second == largest)
            System.out.println("No second largest distinct number.");
        else
            System.out.println("Second largest: " + second);
    }
}


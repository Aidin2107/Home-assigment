public class task4 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};
        String result = " ";
        System.out.print("Array:");
        for (int x : arr) System.out.print(" " + x);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !result.contains(" " + arr[i] + " ")) {
                    result += arr[i] + " ";
                }
            }
        }
        if (result.equals(" "))
            System.out.println("No duplicate numbers.");
        else
            System.out.println("Duplicate numbers:" + result);
    }
}
